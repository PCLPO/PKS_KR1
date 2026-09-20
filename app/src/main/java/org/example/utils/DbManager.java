import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DbManager {
  private static final HikariDataSource dataSource;
  static {
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(System.getenv("DATABASEURL"));
    config.setMaximumPoolSize(10);
    config.setMinimumIdle(2);
    config.setConnectionTimeout(30000);

    dataSource = new HikariDataSource(config);
  }

  public static DataSource getDataSource() {
    return dataSource;
  }

  public static void close() {
    dataSource.close();
  }
}
