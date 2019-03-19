package tdh.platform.export.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Component;
import tdh.platform.export.config.datasource.DataSourceHolder;
import tdh.platform.export.config.ExportDatasourceCondition;
import tdh.platform.export.service.service.CustomRabbitTemplate;
import tdh.platform.export.service.service.impl.ExportServiceImpl;
import tdh.platform.export.service.service.impl.ExportTaskServiceImpl;

@Aspect
@Order(-1)
@Component
@EnableAspectJAutoProxy
@Conditional(ExportDatasourceCondition.class)
public class DatasourceAop {
    private static final Logger logger = LoggerFactory.getLogger(DatasourceAop.class);

    @Pointcut(value = "execution(* tdh.platform.export.service..*.*(..))")
    public void switchDatabase() {
    }

    @Before("execution(* *..*Service*.*(..))) && !switchDatabase()")
    public void beforeMethod(JoinPoint joinPoint) {
        Object target = joinPoint.getTarget();
        if (target instanceof FormattingConversionServiceFactoryBean) {
            return;
        }
        if (target instanceof ExportServiceImpl || target instanceof ExportTaskServiceImpl || target instanceof CustomRabbitTemplate) {
            DataSourceHolder.taskDb();
        } else {

            DataSourceHolder.defaultDb();
        }
    }

    //
    @Before("switchDatabase()")
    public void beforeSwitch(JoinPoint joinPoint) {
        DataSourceHolder.taskDb();
    }
}
