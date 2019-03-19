package tdh.platform.export.service.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tdh.platform.export.config.datasource.DataSourceHolder;
import tdh.platform.export.criteria.*;
import tdh.platform.export.utils.*;
import tdh.platform.fin.api.entity.req.criteria.*;
import tdh.platform.export.dao.IExportTaskMapper;
import tdh.platform.export.dao.IExportTemplateMapper;
import tdh.platform.export.entity.ExportContext;
import tdh.platform.export.entity.ExportTask;
import tdh.platform.export.entity.ExportTemplate;
import tdh.platform.export.exception.ExportException;
import tdh.platform.export.service.service.IExportService;
import tdh.platform.utruck.api.service.common.export.entity.request.*;
import tdh.thunder.common.PaginatedList;
import tdh.thunder.common.Pagination;
import tdh.thunder.common.utils.ConfigProperties;
import tdh.thunder.filestore.FSException;
import tdh.thunder.filestore.FSUtil;
import tdh.thunder.filestore.FileOption;
import tdh.thunder.filestore.FileUploader;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExportServiceImpl implements IExportService {

    private static final Logger LOGGER = Logger.getLogger(ExportServiceImpl.class);
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @Autowired
    private IExportTemplateMapper exportTemplateMapper;

    @Autowired
    private IExportTaskMapper IExportTaskMapper;


    /**
     * 文件临时创建目录, 默认目录
     */
    private String attachmentURL = ConfigProperties.getInstance("general_export").getPropertyAsString("export.temp.path");

    @Override
    @SuppressWarnings("unchecked")
    public void executeExport(ExportContext exportContext) throws Exception {
        LOGGER.info("执行导出任务");
        Integer taskId = exportContext.getTaskId();
        // 执行导出任
        Integer exportTemplateId = exportContext.getExportTemplateId();
        /**
         * 根据导出类型获取导出list方法参数
         */
        Pagination criteria = (Pagination) getMethodCriteria(exportContext);

        // 根据模板ID 从数据库中获取模板信息
        ExportTemplate exportTemplate = exportTemplateMapper.selectByPrimaryKey(exportTemplateId);
        byte[] resource = exportTemplate.getResource();
        String className = exportTemplate.getClassName();
        String methodName = exportTemplate.getMethodName();
        String fileName = exportTemplate.getFileName();
        String attachment = null;
        File destFile = null;
        // 填充数据
        Map parameters = new HashMap();
        // Excel 模板二进制数据
        InputStream is = new ByteArrayInputStream(resource);

        // 设置输入输出流--执行导出
        JRXlsExporter exporter = new JRXlsExporter(); // Excel
        // 导出文件存放路径
        String dateTime = DateFormatUtils.format(new Date(), "yyyyMMddHHmm");
        if (criteria.getPagesize() > 0) {
            criteria.setTotal(Integer.MAX_VALUE);
            destFile = new File(attachmentURL + fileName + dateTime + ".xlsx");
            PaginationExport ds = null;
            try {
                ds = new PaginationExport(className, methodName, criteria);
            } catch (Exception e) {
                throw new ExportException("Spring 容器中获取下载数据源接口失败类： " + className);
            }
            attachment = executeExportPagination(ds, destFile, fileName);
        } else {
            //  反射机制获取导出的数据源
            List<T> result = reflexGetList(criteria, className, methodName);

            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(result);
            JasperPrint jasperPrint = JasperFillManager.fillReport(is, parameters, ds);

            destFile = new File(attachmentURL + fileName + dateTime + ".xls");
            attachment = executeExport(exporter, jasperPrint, destFile);
        }


        // 更新下载任务--存入附件
        updateExportTask(taskId, destFile, attachment);
    }

    /**
     * 执行分页导出
     */
    private String executeExportPagination(PaginationExport paginationExport, File destFile, String filename) throws Exception {

        ExcelUtils excelUtils = new ExcelUtils(paginationExport);
        excelUtils.executeExport(destFile, filename);

        return executeExport(destFile);
    }


    private void updateExportTask(Integer taskId, File destFile, String attachment) {
        ExportTask exportTask = new ExportTask();
        exportTask.setId(taskId);
        exportTask.setTaskName(destFile.getName());
        exportTask.setAttachment(attachment);
        exportTask.setTaskStatus(ExportConstants.TASK_STATUS_9);
        exportTask.setUpdatedBy(-1);
        exportTask.setUpdatedTime(new Date());
        if (SpringUtil.getApplicationContext().containsBean("routingDataSource")) {
            DataSourceHolder.taskDb();
        }
        IExportTaskMapper.updateByPrimaryKeySelective(exportTask);
    }

    private String executeExport(JRXlsExporter exporter, JasperPrint jasperPrint, File destFile) throws JRException,
            FSException {
        exportToPath(exporter, jasperPrint, destFile);
        // 上传到服务器
        return executeExport(destFile);
    }

    private String executeExport(File destFile) throws FSException {
        FileUploader fileUploader = new FileUploader();
        FileOption fo = new FileOption();
        fo.setPrivacy(false);
        fo.setFileName(destFile.getName());
        fo.setExtension(FSUtil.getExtensionByFileName(destFile.getName()));
        FileOption fileOption = fileUploader.upload(null, destFile, fo);
        return fileOption.getId();
    }

    /**
     * 导出到文件
     */
    private void exportToPath(JRXlsExporter exporter, JasperPrint jasperPrint, File destFile) throws JRException {
        exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFile));
        SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
        configuration.setOnePagePerSheet(false);
        configuration.setDetectCellType(true);// 检查单元格格式
        exporter.setConfiguration(configuration);
        exporter.exportReport();
    }

    @SuppressWarnings("unchecked")
    private List<T> reflexGetList(Object criteria, String className, String methodName) throws ClassNotFoundException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        PaginatedList<T> paginatedList = new PaginatedList<T>();

        Class<?> clazz = Class.forName(className);
        Object bean = SpringUtil.getBean(clazz);
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (methodName.equals(method.getName())) {
                paginatedList = (PaginatedList<T>) method.invoke(bean, criteria);
                break;
            }
        }
        return paginatedList.getResult();
    }

    public Object getMethodCriteria(ExportContext exportContext) throws Exception {

        String exportType = exportContext.getExportType();

        if (ExportConstants.EXPORT_TYPE_ORDERTARGE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_DEBITNOTE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, DebitNoteExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_STATECUSDET.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_STATESUPPDET.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_SHIPMENT.equals(exportType)
                || ExportConstants.EXPORT_TYPE_COMPANY_SHIPMENT.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SearchOrderInfoCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_COMPANY_DEPART.equals(exportType)
                || ExportConstants.EXPORT_TYPE_DEPART.equals(exportType)
                || ExportConstants.EXPORT_TYPE_SHUTTLE_DEPART.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SearchDepartOrderCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_ROUTERESOURCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, RouteBindResourceCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_ROUTEPRICE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SearchRouteRevisionCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_SHUTTLE_SHIP.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SearchShuttleShipOrderCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_SHUTTLE.equals(exportType)
                || ExportConstants.EXPORT_TYPE_COMPANY_SHUTTLE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SearchShuttleOrderCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_TRAILER_ORDER.equals(exportType)
                || ExportConstants.EXPORT_TYPE_COMPANY_TRAILER_ORDER.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SearchTrailerOrderCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_RECEIVE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, OrderChargeExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_COMPANY_DEPART.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SearchDepartOrderCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_KH_MANAGER_REPORT.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, KhManagerReportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_DRIVERRESOURCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, DriverExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_TRUCKRESOURCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, TruckExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_TRAILERRESOURCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, TrailerExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_VENDORRESOURCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, VendorExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_UPSTREAM_STATE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_OIL_STATE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_OIL_STATE_DETAIL.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_CARR_STATE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_CARR_STATE_DETAIL.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_YK_UTORDER.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, UtOrderExportRequest.class);
        } else if (ExportConstants.EXPORT_TYPE_YK_UTORDERABNORMAL.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, UtAbnormalExportRequest.class);
        } else if (ExportConstants.EXPORT_TYPE_YK_UTREPORT.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, UtReportExportRequest.class);
        } else if (ExportConstants.EXPORT_TYPE_TRANS_MANAGER_REPORT.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, TransManagerReportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_SUPPLIER_ADJUS_DETAIL.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SupplierAchiAdjuExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_RECEIPT.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_RECEIPT_APPLY_BILL.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, ReceiptExterCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_CONTRACT_CHANGES_RESOURCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, ContractChangExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_OPERATION_PRESCRIPTION_REPORT.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, OperationPrescriptionReportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_TMS.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, SearchOrderInfoCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_SELFTRUCKRESOURCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, TruckSelfExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_SignContract.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, ContractExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_TempContract.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, ContractExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_ElecFence.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, ElecFenceExportCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_KH_GPS_REPORT_DISTANCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, KhGpsReportSearchCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_KH_GPS_REPORT_FENCE.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, KhGpsReportSearchCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_KH_GPS_REPORT_ALARM.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, KhGpsReportSearchCriteria.class);
        } else if (ExportConstants.EXPORT_TYPE_Branch.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, VirtualBranchExportCriteria.class);
        } else if (ExportConstants.EXPORT_TASK_TYPE_INVOICE_APPLY.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, InvoiceApplyExterCriteria.class);
        } else if (ExportConstants.EXPORT_TASK_TYPE_INVAPPLYORDER.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, StatementExterCriteria.class);
        } else if (ExportConstants.EXPORT_TASK_TYPE_YKUTORDERANOMALY.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, UtOrderAnomalyExportRequest.class);
        } else if (ExportConstants.EXPORT_TASK_TYPE_YKUTCUSTOMERLOGINANOMALY.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, UtCustomerLoginAnomalyExportRequest.class);
        } else if (ExportConstants.EXPORT_TASK_TYPE_YKUTDEVICELOGINANOMALY.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, UtDeviceLoginAnomalyExportRequest.class);
        } else if (ExportConstants.EXPORT_TASK_TYPE_YKUTORDERANOMALYDETAIL.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, UtOrderAnomalyDetailExportRequest.class);
        } else if (ExportConstants.EXPORT_TASK_TYPE_INVAPPLYINFO.equals(exportType)) {
            String strCriteria = exportContext.getCriteria();
            return MAPPER.readValue(strCriteria, InvoiceApplyExterCriteria.class);
        } else {
            throw new ExportException(I18n.getMsg(M.EXPORT_TYPE_ERROR));
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false, rollbackFor = Exception.class)
    public void updateTaskStatus(Integer taskId, String errorMsg) {
        ExportTask exportTask = new ExportTask();
        exportTask.setId(taskId);
        exportTask.setTaskStatus(ExportConstants.TASK_STATUS_1);
        exportTask.setUpdatedBy(-1);
        exportTask.setUpdatedTime(new Date());
        exportTask.setRemark(errorMsg);
        IExportTaskMapper.updateByPrimaryKeySelective(exportTask);
    }

    public String getAttachmentURL() {
        return attachmentURL;
    }

    public void setAttachmentURL(String attachmentURL) {
        this.attachmentURL = attachmentURL;
    }


}
