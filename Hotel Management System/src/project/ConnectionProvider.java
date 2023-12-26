package project;

import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionProvider {
    public static Connection getcon()
    {
        try
        {
         // Class.forName("com.mysql.cj.jdbc.Driver");
          //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
          Class.forName("org.apache.derby.jdbc.ClientDriver");
          String url="jdbc:derby://localhost:1527/hotel;create=true;";
          String user= "hotel";
          String pass="1234";
            Connection con=DriverManager.getConnection(url,user,pass);
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
        
    }
}
