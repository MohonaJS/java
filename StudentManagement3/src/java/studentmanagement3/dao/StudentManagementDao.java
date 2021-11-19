
package studentmanagement3.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentmanagement3.model.Smanagement;
import studentmanagement3.util.DBConnection;


public class StudentManagementDao {

    public StudentManagementDao() {
    }
    
    static DBConnection db;
    
    public static int save(Smanagement value){
        int status =0;
        String sql="insert into smanagement2 (coursename,branchname,rollnumber,name,fathername,gender) values(?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setString(1, value.getCoursename());
            ps.setString(2, value.getBranchname());
            ps.setString(3, value.getRollnumber());
            ps.setString(4, value.getName());
            ps.setString(5, value.getFathername());
            ps.setString(6, value.getGender());
            status=ps.executeUpdate();
            db.getCon().close();
            ps.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentManagementDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentManagementDao.class.getName()).log(Level.SEVERE, null, ex);
        }
     return status;
    }
    
     public static List<Smanagement> viewAll(){
         List<Smanagement> list=new ArrayList<Smanagement>();
         String sql="select * from smanagement2";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Smanagement s= new Smanagement(
                       rs.getInt("id"),
                       rs.getString("courseName"),
                       rs.getString("branchName"),
                       rs.getString("rollNumber"),
                       rs.getString("name"),
                       rs.getString("fatherName"),
                       rs.getString("gender")
               );
                      
                
                list.add(s);
            
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Smanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Smanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     
     
     return list;
     }
    
    
}
