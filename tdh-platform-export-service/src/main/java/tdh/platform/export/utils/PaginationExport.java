package tdh.platform.export.utils;

import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.ss.formula.functions.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tdh.platform.export.config.DictConfig;
import tdh.platform.export.exception.ExportException;
import tdh.thunder.common.PaginatedList;
import tdh.thunder.common.Pagination;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class PaginationExport {

    private static final Logger logger = LoggerFactory.getLogger(PaginationExport.class);

    private Collection<?> data;
    private Iterator<?> iterator;
    private Object currentBean;

    private Object dataSource;
    private String methodName;
    private Object criteria;
    private Method[] methods;


    @SuppressWarnings("unchecked")
    public PaginationExport(String className, String methodName, Object criteria)
            throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);
        this.methods = clazz.getMethods();
        this.dataSource = SpringUtil.getBean(clazz);
        this.methodName = methodName;
        this.criteria = criteria;
    }

    private boolean hasNext = false;


    public Class<?> getClazz() {
        if (this.currentBean == null) {
            boolean next = this.next();
            if (!next) {
                return null;
            }
        }
        return this.currentBean.getClass();
    }


    @SuppressWarnings("unchecked")
    public boolean next() {
        if (this.iterator == null) {
            for (Method method : methods) {
                if (method.getName().equalsIgnoreCase(methodName)) {
                    try {
                        PaginatedList<T> result = (PaginatedList<T>) method.invoke(this.dataSource, this.criteria);
                        // 如果获取的数据为空则返回 false
                        if (CollectionUtils.isEmpty(result.getResult())) {
                            return false;
                        }
                        this.data = result.getResult();
                        this.iterator = result.getResult().iterator();
                        hasNext = this.iterator.hasNext();
                        this.currentBean = this.iterator.next();
                        break;
                    } catch (Exception e) {
                        logger.error(e.getMessage(), e);
                        throw new ExportException("反射分页查询下载数据失败", e);
                    }
                }
            }
        } else {
            hasNext = this.iterator.hasNext();
            if (hasNext) {
                this.currentBean = this.iterator.next();
            } else {
                this.iterator = null;
                this.data = null;
                this.currentBean = null;
                Pagination criteria = (Pagination) this.criteria;
                criteria.setPage(criteria.getPage() + 1);
                this.next();
            }
        }
        return hasNext;
    }

    public String getFieldValue(ExcelHeader excelHeader) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (this.currentBean == null) {
            return "";
        }
        String fieldName = excelHeader.getFieldName();
        Class<?> clazz = this.currentBean.getClass();
        String mn = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        Method method = clazz.getMethod(mn);
        Object result = method.invoke(this.currentBean);
        if (result == null) {
            return "";
        }
        if (excelHeader.isDict()) {
            return DictConfig.dict.get(result);
        }
        if (result instanceof Date) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.format(result);

        }
        return String.valueOf(result);
    }

}
