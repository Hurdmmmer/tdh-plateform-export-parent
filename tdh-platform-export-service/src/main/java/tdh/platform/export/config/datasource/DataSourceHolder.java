package tdh.platform.export.config.datasource;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DataSourceHolder {
    private static final Logger logger = LoggerFactory.getLogger(DataSourceHolder.class);

    //线程本地环境
    private static final ThreadLocal<String> contextHolders = new ThreadLocal<String>();
    //数据源列表
    public static List<String> dataSourceIds = Lists.newArrayList();
    //设置数据源
    public static void setDataSource(String customerType) {
        contextHolders.set(customerType);
    }
    /** 获取当前的数据源 */
    public static String getDataSource() {
        return contextHolders.get();
    }
    //清除数据源
    public static void clearDataSource() {
        contextHolders.remove();
    }

    public static void defaultDb() {
        logger.info("切换到默认数据源");
        contextHolders.set(DatasourceConst.DEFAULT_DB);
    }

    public static void taskDb() {
        logger.info("切换到下载任务数据源");
        contextHolders.set(DatasourceConst.TASK_DB);
    }


    /**
     * 判断指定DataSrouce当前是否存在
     */
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }
}