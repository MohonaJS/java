
package webtest2.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import webtest2.model.Customer;
import webtest2.util.DBConnection;

public class CustomerDao {

    public CustomerDao() {
    }
    static DBConnection db;
    
    public static int save(Customer value){
        int status =0;
   
        String sql ="insert into customer (name, password, email, gender, country) values (?,?,?,?,?)";
        try {
            PreparedStatement pst= db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getPassword());
            pst.setString(3, value.getEmail());
            pst.setString(4, value.getGender());
            pst.setString(5, value.getCountry());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
         }
    public static int update (Customer value) throws ClassNotFoundException {
        int status=0;
        String sql="update customer name=?,password=?,email=?,gender=?,country=? where =id?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getPassword());
            pst.setString(3, value.getEmail());
            pst.setString(4, value.getGender());
            pst.setString(4, value.getCountry());
            pst.setInt(5, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return status;
    }
    public static int delete (Customer value) throws ClassNotFoundException {
        int status=0;
        String sql="delete from customer where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setInt(5, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
}
    public static Customer find (int id) throws ClassNotFoundException {
      Customer c=null;
        String sql="select * from customer where id=?";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    c = new Customer();
                    c.setId(rs.getInt("id"));
                    c.setName(rs.getString("name")); 
                    c.setPassword(rs.getString("password"));
                    c.setEmail(rs.getString("email"));
                    c.setGender(rs.getString("gender"));
                    c.setCountry(rs.getString("country"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
        }
    public static List<Customer> getAll() {
    List<Customer> list = new ArrayList<Customer>();
    String sql ="select * from customer";
        try {
            PreparedStatement ps = db.getCon().prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("gender"),
                        rs.getString("country"));
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
