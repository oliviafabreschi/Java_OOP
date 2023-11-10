import java.sql.*;

/**
 * Code to connect to MySQL database
 * Requires mysql connectorj.jar to be added to library
 * Using configuration file for secure credential storage
 */
public class Main {
    public static void main(String[] args) {

        String username = AppConfig.getDbUsername();
        //enter information/get password from other source
        String password= AppConfig.getDbPassword();
        //enter information
        String databaseName = AppConfig.getDbName();
        //enter information
        String tableName = AppConfig.gettableName();
        String url = AppConfig.getdbURL();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //can change out with whichever SQL statement
            String sqlQuery = "select * from "+databaseName +"." + tableName;
            //query to add data
            String sqlQueryAddData = "insert into " + tableName+ " values (8, 'Lisa', 'Smith') ";

            //executing statement
            statement.executeUpdate(sqlQueryAddData);

            //result set for select statement
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            //showcasing results in terminal
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " "
                        + resultSet.getString(2) + " "
                        + resultSet.getString(3));
            }

            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}