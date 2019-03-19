package tdh.platform.export.config;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import tdh.thunder.common.utils.ConfigProperties;

public class ExportDatasourceCondition implements Condition {

    private static final Logger logger = LoggerFactory.getLogger(ExportDatasourceCondition.class);

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigProperties exprot = ConfigProperties.getInstance("general_export");
        String host = exprot.getPropertyAsString("export.db.url");
        if (StringUtils.isNotEmpty(host)) {
            logger.info("配置了任务数据库IP地址， 准备实例化任务数据库...");
            return true;
        }
        logger.info("没有配置任务数据库IP地址， 使用默认数据连接池，请注意是否存在下载任务表等...");
        return false;
    }
}
