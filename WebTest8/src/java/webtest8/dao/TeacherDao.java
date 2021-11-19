
package webtest8.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import webtest8.model.Teacher;
import webtest8.util.DBConnection;

public class TeacherDao {

    public TeacherDao() {
    }
    static DBConnection db;
    
    public static int save(Teacher value){
        int status =0;
        String sql="insert into teacher (name,email,password,gender,subject)"
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setString(1, value.getName());
            ps.setString(2, value.getEmail());
            ps.setString(3, value.getPassword());
            ps.setString(4, value.getGender());
            ps.setString(5, value.getSubject());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return status;
    
    }
    
    public static int update(Teacher value) throws ClassNotFoundException {
         int status=0;
         String sql="update teacher set name=?,email=?,password=?,gender=?,subject=? where id=?";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setString(1, value.getName());
            ps.setString(2, value.getEmail());
            ps.setString(3, value.getPassword());
            ps.setString(4, value.getGender());
            ps.setString(5, value.getSubject());
            ps.setInt(6, value.getId());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     return status;
      }
     public static int delete (Teacher value) throws ClassNotFoundException {
         int status=0;
         String sql="delete from teacher where id=?";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, value.getId());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     return status;
     }
     public static List<Teacher> viewAll (){
      List<Teacher> list= new ArrayList<Teacher>();
      String sql="select * from teacher";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            Teacher t= new Teacher(
                   rs.getInt("id"), 
                    rs.getString("name"), 
                    rs.getString("email"), 
                    rs.getString("password"), 
                    rs.getString("gender"), 
                    rs.getString("subject")
                    
            );
            list.add(t);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     return list;
     }
     
     public static Teacher find(int id){
         Teacher t=null;
         String sql="select * from teacher where id=?";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                t=new Teacher(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("password"),
                    rs.getString("gender"),
                    rs.getString("subject")
                    );

                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TeacherDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return t;  
     }
    
}
