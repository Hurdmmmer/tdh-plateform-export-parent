package tdh.platform.export.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/***
 * 字典对象
 */
@Component
public class DictConfig {
    public static Map<String, String> dict = new HashMap<>();

    private final String DICT_SQL = "select DCTCODE, DCTVALUE from sys_dict";
    @Autowired
    private Map<String, DataSource> dataSource;


    @PostConstruct
    public void init() {
        DataSource taskDatasource = null;
        if (dataSource.size() > 1) {
            taskDatasource = dataSource.get("taskDatasource");
        } else {
            taskDatasource = dataSource.entrySet().iterator().next().getValue();
        }
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = taskDatasource.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(DICT_SQL);
            while (resultSet.next()) {
                String dctCode = resultSet.getString("DCTCODE");
                String dctValue = resultSet.getString("DCTVALUE");
                dict.put(dctCode, dctValue);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
