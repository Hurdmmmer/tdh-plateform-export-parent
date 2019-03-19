package tdh.platform.export.config;

import com.google.common.collect.Maps;
import org.logicalcobwebs.proxool.ProxoolDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import tdh.platform.export.config.datasource.DatasourceConst;
import tdh.platform.export.config.datasource.DatasourceRegister;
import tdh.platform.export.config.datasource.RoutingDataSource;
import tdh.thunder.common.utils.ConfigProperties;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class ExportDsConfig {

    private static ConfigProperties config;

    private ConfigProperties getConfig() {
        if (config == null) {
            config = ConfigProperties.getInstance("general_export");
        }
        return config;
    }

    @Bean(name = "taskDatasource")
    @Conditional(ExportDatasourceCondition.class)
    @Order(-1)
    public DataSource taskDatasource() {
        ProxoolDataSource dataSource = new ProxoolDataSource();
        dataSource.setDriver("com.mysql.jdbc.Driver");
        dataSource.setDriverUrl(getConfig().getPropertyAsString("export.db.url"));
        dataSource.setUser(getConfig().getPropertyAsString("export.db.user"));
        dataSource.setPassword(getConfig().getPropertyAsString("export.db.password"));
        dataSource.setHouseKeepingTestSql("select 1");
        dataSource.setSimultaneousBuildThrottle(20);
        dataSource.setMaximumConnectionCount(80);
        dataSource.setMinimumConnectionCount(3);
        dataSource.setMaximumActiveTime(14400000);
        dataSource.setTrace(true);
        dataSource.setPrototypeCount(5);
        return dataSource;
    }

    @Bean(name = "routingDataSource")
    @Conditional(ExportDatasourceCondition.class)
    @Order(1)
    public DataSource routingDataSource(Map<String, DataSource> dataSourceMap) {
        RoutingDataSource routingDataSource = new RoutingDataSource();
        DataSource taskDatasource = dataSourceMap.remove("taskDatasource");
        DataSource defaultDs = dataSourceMap.entrySet().iterator().next().getValue();
        routingDataSource.setDefaultTargetDataSource(defaultDs);
        Map<Object, Object> maps = Maps.newHashMap();

        maps.put(DatasourceConst.DEFAULT_DB, defaultDs);
        maps.put(DatasourceConst.TASK_DB, taskDatasource);

        routingDataSource.setTargetDataSources(maps);

        return routingDataSource;
    }

    @Bean
    @Conditional(ExportDatasourceCondition.class)
    @Order
    public DatasourceRegister datasourceRegister(@Qualifier("routingDataSource") DataSource dataSource) {
        DatasourceRegister datasourceRegister = new DatasourceRegister();
        datasourceRegister.setDataSource(dataSource);
        return datasourceRegister;
    }

//    @Bean
//    @Order(-1)
//    public DatasourceAop datasourceAop() {
//        return new DatasourceAop();
//    }
}
