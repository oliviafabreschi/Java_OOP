import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    private static Properties properties;

    static {
        properties = new Properties();
        try (FileInputStream configFile = new FileInputStream("database-test/toignore/config.properties")) {
            properties.load(configFile);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception (e.g., provide default values or terminate the application).
        }
    }

    public static String getDbUsername() {
        return properties.getProperty("db.username");
    }

    public static String getDbPassword() {
        return properties.getProperty("db.password");
    }

    public static String getDbName() {
        return properties.getProperty("db.dbName");
    }

    public static String gettableName() {
        return properties.getProperty("db.tableName");
    }


    public static String getdbURL() {
        return properties.getProperty("db.url");
    }
}