package tdh.platform.export.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import tdh.platform.export.annotation.ExportField;
import tdh.platform.export.exception.ExportException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcelUtils {

    private PaginationExport paginationExport;

    public ExcelUtils(PaginationExport paginationExport) {
        this.paginationExport = paginationExport;
    }

    public void executeExport(File destFile, String filename)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, IOException {
        Class<?> clazz = this.paginationExport.getClazz();
        if (clazz == null) {
            throw new ExportException("反射调用数据源， 返回数据列表为空");
        }
        List<ExcelHeader> excelHeaders = this.getTitleList(clazz);

        Collections.sort(excelHeaders);

        SXSSFWorkbook workbook = new SXSSFWorkbook(100);
        SXSSFSheet sheet = null;
        int t = 0;
        int index = 2;
        CellStyle style1 = createStyle(workbook, 10);
        do {
            if (index % 500000 == 0 || sheet == null) {
                index = 2;
                sheet = createSheet(workbook, filename, excelHeaders, t++);
            }

            // 设置导出数据
            SXSSFRow dataRow = sheet.createRow(index++);
            dataRow.setHeightInPoints(20.0f);
            for (int i = 0; i < excelHeaders.size(); i++) {
                SXSSFCell dataRowCell = dataRow.createCell(i);
                String fieldValue = this.paginationExport.getFieldValue(excelHeaders.get(i));
                dataRowCell.setCellValue(fieldValue);
                dataRowCell.setCellStyle(style1);
            }
        } while (hasNext());


        FileOutputStream out = new FileOutputStream(destFile);
        workbook.write(out);
        out.close();
        workbook.dispose();
    }

    public SXSSFSheet createSheet(SXSSFWorkbook workbook, String filename, List<ExcelHeader> excelHeaders, int t) {
        SXSSFSheet sheet = workbook.createSheet(filename + t);
        CellRangeAddress rangeAddress = new CellRangeAddress(0, 0, 0, excelHeaders.size() - 1);
        // 合并单元格
        sheet.addMergedRegion(rangeAddress);
        SXSSFRow headerTitle = sheet.createRow(0);
        sheet.setDefaultColumnWidth(20);  // 设置列宽
        headerTitle.setHeightInPoints(30.0f);
        SXSSFCell titleCell = headerTitle.createCell(0);
        CellStyle style = createStyle(workbook, 16);
        titleCell.setCellValue(filename);
        // 设置单元格样式
        titleCell.setCellStyle(style);
        // 设置标题
        SXSSFRow headerRow = sheet.createRow(1);
        headerRow.setHeightInPoints(20.0f);
        CellStyle header = createStyle(workbook, 12);
        for (int i = 0; i < excelHeaders.size(); i++) {
            SXSSFCell cell = headerRow.createCell(i);
            cell.setCellValue(excelHeaders.get(i).getTitle());
            cell.setCellStyle(header);
        }
        return sheet;
    }

    public CellStyle createStyle(SXSSFWorkbook wb, int fontSize) {
        CellStyle style = wb.createCellStyle();
        style.setBorderBottom(BorderStyle.THIN);//下边框
        style.setBorderLeft(BorderStyle.THIN);//左边框
        style.setBorderRight(BorderStyle.THIN);//右边框
        style.setBorderTop(BorderStyle.THIN); //上边框


        //设置字体
        Font font = wb.createFont();
        font.setFontName("宋体");//设置字体名称
        font.setFontHeightInPoints((short) fontSize);//设置字号
        font.setItalic(false);//设置是否为斜体
        font.setBold(false);//设置是否加粗
        font.setColor(IndexedColors.BLACK.index);//设置字体颜色
        style.setFont(font);

        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setAlignment(HorizontalAlignment.CENTER);
        return style;
    }

    /**
     * 根据对象获取导出的字段
     */
    private List<ExcelHeader> getTitleList(Class<?> clz) {
        List<ExcelHeader> excelHeaders = new ArrayList<>();
        Field[] fields = clz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ExportField.class)) {
                ExportField annotation = field.getAnnotation(ExportField.class);
                excelHeaders.add(new ExcelHeader(annotation.name(), annotation.defaultValue(), field.getName(), annotation.order(), annotation.isDict()));
            }
        }
        return excelHeaders;
    }


    private boolean hasNext() {
        return this.paginationExport.next();
    }
}
