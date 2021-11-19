
package webtest4.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import webtest4.model.Customer1;
import webtest4.util.DBConnection;

 public class CustomerDao {

    public CustomerDao() {
    }
    public static DBConnection db;
    
    public static int save (Customer1 value) throws ClassNotFoundException{
        int status=0;
        String sql="insert into customer1 (name,email,password) values (?,?,?)";
        try {
            PreparedStatement pst=DBConnection.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getEmail());
            pst.setString(3, value.getPassword());
            status=pst.executeUpdate();
            pst.close();
            DBConnection.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status; 
    }
     public static int update (Customer1 value) throws ClassNotFoundException {
        int status=0;
        String sql="update customer1 name=?,email=?,password=? where =id?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getPassword());
            pst.setString(3, value.getEmail());
            pst.setInt(4, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return status;
    }
    public static int delete (Customer1 value) throws ClassNotFoundException {
        int status=0;
        String sql="delete from customer1 where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setInt(4, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
}
     public static List<Customer1> getAll() {
    List<Customer1> list = new ArrayList<Customer1>();
    String sql ="select * from customer";
        try {
            PreparedStatement ps = db.getCon().prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {
                Customer1 c = new Customer1(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password")
                        );
                list.add(c);
                      
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
    }
  
     
     
}

