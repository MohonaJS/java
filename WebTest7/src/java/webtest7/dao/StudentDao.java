
package webtest7.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static webtest7.dao.ResultDao.db;
import webtest7.model.Result;
import webtest7.model.Student;
import webtest7.util.DBConnection;



public class StudentDao {
    
    public StudentDao() {
    }
     static DBConnection db;
     public static int save(Student value){
         int status =0;
         String sql="insert into student (name,email,age,subject,gender) values (?,?,?,?,?)";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getEmail());
            pst.setString(3, value.getAge());
            pst.setString(4, value.getSubject());
            pst.setString(5, value.getGender());
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
     
      public static int update (Student value) throws ClassNotFoundException {
         int status=0;
         String sql="update student set name=?,email=?,age=?,subject=?,gender=? where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setString(1, value.getName());
            pst.setString(2, value.getEmail());
            pst.setString(3, value.getAge());
            pst.setString(4, value.getSubject());
            pst.setString(5, value.getGender());
            pst.setInt(6, value.getId());
            status=pst.executeUpdate();
            pst.close();
            db.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     return status;
      }
      
      public static int delete (Student value) throws ClassNotFoundException {
         int status=0;
         String sql="delete from student where id=?";
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
     
     public static List<Student> viewAll (){
      List<Student> list= new ArrayList<Student>();
      String sql="select * from student";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            Student s= new Student(
                   rs.getInt("id"), 
                    rs.getString("name"), 
                    rs.getString("email"), 
                    rs.getString("age"), 
                    rs.getString("subject"), 
                    rs.getString("gender")
                    
            );
            list.add(s);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
     return list;
     }
     
     public static Student find(int id){
         Student s=null;
         String sql="select * from student where id=?";
        try {
            PreparedStatement pst=db.getCon().prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                s=new Student(
                        rs.getInt("id"), 
                    rs.getString("name"), 
                    rs.getString("email"), 
                    rs.getString("age"), 
                    rs.getString("subject"), 
                    rs.getString("gender")
            );
            
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
     return s;
     }
}
