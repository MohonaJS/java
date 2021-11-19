
package studentmanagement2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnection {
    private static Connection con;
    private static String url="jdbc:mysql://localhost:3306/java";
   private static String user="root";
    private static String password="";
    
    
    
    public static Connection getCon() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        
        return con;
    }
    
    
    
}
