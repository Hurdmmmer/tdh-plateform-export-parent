package tdh.platform.export.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExportField {
    /** 导出的字段名称 */
    String name();
    /** 默认值 */
    String defaultValue() default "";
    /** 是否是字典 */
    boolean isDict() default false;
    /**
     * 导出的字段顺序
     */
    int order() default 0;
}
