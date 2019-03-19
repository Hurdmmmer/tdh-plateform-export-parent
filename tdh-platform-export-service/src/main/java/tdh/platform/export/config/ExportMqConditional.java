package tdh.platform.export.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.classreading.MethodMetadataReadingVisitor;

public class ExportMqConditional implements Condition {
    private static final Logger logger = LoggerFactory.getLogger(ExportMqConditional.class);

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        String methodName = ((MethodMetadataReadingVisitor) annotatedTypeMetadata).getMethodName();
        switch (methodName) {
            case "connectionFactory":
                try {
                    boolean flag = conditionContext.getRegistry().containsBeanDefinition("connectionFactory");
                    return !flag;
                } catch (BeansException e) {
                    logger.warn("没有找到 RabbitMQ 连接工厂自动创建一个连接工厂..");
                }
                return true;
            case "rabbitAdmin":
                try {
                    boolean flag = conditionContext.getRegistry().containsBeanDefinition("rabbitAdmin");
                    return !flag;
                } catch (BeansException e) {
                    logger.warn("没有发现 RabbitAdmin 自动创建一个..");
                }
                return true;

            default:
                logger.error("出现未知错误...");
                return true;

        }
//        return true;
    }
}
