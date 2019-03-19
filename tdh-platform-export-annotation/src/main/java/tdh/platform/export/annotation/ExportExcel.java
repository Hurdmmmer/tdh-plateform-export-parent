package tdh.platform.export.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExportExcel {
    /** 导出的名称 */
    String name() default "";
    /** 是否统计某字段数据 */
    boolean isCount() default false;
    /** 统计字段名称 */
    String[] fieldNames();
}
