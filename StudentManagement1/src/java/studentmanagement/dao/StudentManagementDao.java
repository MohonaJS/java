
package studentmanagement.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentmanagement.model.StudentManagement;
import studentmanagement.util.DBConnection;


public class StudentManagementDao {
    
    public StudentManagementDao(){
    }
    static DBConnection db;
    
     public static int save(StudentManagement value){
        int status =0;
        String sql="insert into studentManagement (courseName,branchName,rollNumber,name,fatherName,gender) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setString(1, value.getCourseName());
            ps.setString(2, value.getBranchName());
            ps.setString(3, value.getRollNumber());
            ps.setString(4, value.getName());
            ps.setString(5, value.getFatherName());
            ps.setString(6 , value.getGender());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManagementDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return status;
    
    }
     
     public static List<StudentManagement> viewAll(){
         List<StudentManagement> list=new ArrayList<StudentManagement>();
         String sql="select*from studentmanagement";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                StudentManagement t=new StudentManagement(
                        rs.getInt("id"),
                        rs.getString("courseName"),
                        rs.getString("branchName"),
                        rs.getString("rollNumber"), 
                        rs.getString("name"), 
                        rs.getString("fatherName"), 
                        rs.getString("gender") 
                );
                
                list.add(t);
            
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManagementDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     
     
     return list;
     }
}
