
package project;
import java.sql.*;

public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path="jdbc:mysql://localhost:3306/bloodbank";
            String user="root";
            String pass="";
            Connection con=DriverManager.getConnection(path,user,pass);
            return con;
        }
        catch(Exception e)
        {
             return null;
        }
       
        
    }
    
}
