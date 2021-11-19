
package webtest7.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import webtest7.model.Result;
import webtest7.util.DBConnection;

public class ResultDao {

    public ResultDao() {
    }
     static DBConnection db;
     public static int save(Result value){
         int status =0;
         String sql="insert into result (name,email,address,password,district) values (?,?,?,?,?)";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getEmail());
            pst.setString(3, value.getAddress());
            pst.setString(4, value.getPassword());
            pst.setString(5, value.getDistrict());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return status;
     }
     public static int update (Result value) throws ClassNotFoundException {
         int status=0;
         String sql="update result set name=?,email=?,address=?,password=?,district=? where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getEmail());
            pst.setString(3, value.getAddress());
            pst.setString(4, value.getPassword());
            pst.setString(5, value.getDistrict());
            pst.setInt(6, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     return status;
     }
     public static int delete (Result value) throws ClassNotFoundException {
         int status=0;
         String sql="delete from result where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setInt(1, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     return status;
     }
     
     public static List<Result> viewAll (){
      List<Result> list= new ArrayList<Result>();
      String sql="select * from result";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            Result r= new Result(
                    rs.getInt("id"), 
                    rs.getString("name"), 
                    rs.getString("email"), 
                    rs.getString("address"), 
                    rs.getString("password"), 
                    rs.getString("district")
            );
            list.add(r);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     return list;
     }
     
     public static Result find(int id){
         Result r=null;
         String sql="select * from result where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                r=new Result(
                        rs.getInt("id"), 
                    rs.getString("name"), 
                    rs.getString("email"), 
                    rs.getString("address"), 
                    rs.getString("password"), 
                    rs.getString("district")
            );
            
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
     return r;
     }
}
