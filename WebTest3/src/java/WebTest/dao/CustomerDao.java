
package WebTest.dao;

import WebTest.model.Customer;
import WevTest3.util.DBConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chowd
 */
public class CustomerDao {

    public CustomerDao() {
    }
    
   static DBConnection db;
 
    public static int save(Customer value)  {
        int status=0;
     String sql="insert into customer ( name, password, email, gender, country) values(?,?,?,?,?)";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getPassword());
            pst.setString(3, value.getEmail());
            pst.setString(4, value.getGender());
            pst.setString(5, value.getCountry());
            status=pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
        
        
        return status;
    }
    
}
