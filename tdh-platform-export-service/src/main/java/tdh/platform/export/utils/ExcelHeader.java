package tdh.platform.export.utils;

public class ExcelHeader implements Comparable<ExcelHeader>{
    private String title;

    private String defaultValue;

    private String fieldName;

    private boolean isDict ;

    private Integer order;

    public ExcelHeader(String title, String value, String fieldName, Integer order, boolean isDict) {
        this.title = title;
        this.defaultValue = value;
        this.fieldName = fieldName;
        this.order = order;
        this.isDict = isDict;
    }

    public boolean isDict() {
        return isDict;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return defaultValue;
    }

    public void setValue(String value) {
        this.defaultValue = value;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public int compareTo(ExcelHeader o) {
        return Integer.compare(order, o.order);
    }
}
