import java.sql.*;

/**
 * Code to connect to MySQL database
 * Requires mysql connectorj.jar to be added to library
 *
 */
public class Main {
    public static void main(String[] args) {

        String username = "root";
        //enter information
        String password="";
        //enter information
        String databaseName = "";
        //enter information
        String tableName = "";
        String url = "jdbc:mysql://localhost:3306/"+databaseName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            //can change out with whichever SQL statement
            String sqlQuery = "select * from "+databaseName +"." + tableName;
            //query to add data
            String sqlQueryAddData = "insert into " + tableName+ " values (4, 'John', 'Smith') ";

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