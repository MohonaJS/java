
package studentmanagement.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static studentmanagement.dao.StudentManagementDao.db;
import studentmanagement.model.StudentManagement;
import studentmanagement.model.StudentResult;
import studentmanagement.util.DBConnection;


public class StudentResultDao {

    public StudentResultDao() {
    }
    
    
    
    static DBConnection db;
    
    public static int save(StudentResult value){
        int status=0;
        String sql="insert into studentresult (rollNumber, enggPhysics1, enggchemistry, enggMathematics1, basicElectricalEngg, electronicEngg, "
                + "enggChemistryLab, enggPhysicsLab) values (?,?,?,?,?,?,?,?)"; 
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
             
            ps.setInt(1, value.getId());
            ps.setString(2, value.getRollNumber());
            ps.setString(3, value.getEnggPhysics1());
            ps.setString(3, value.getEnggChemistry());
            ps.setString(5, value.getEnggMathematics1());
            ps.setString(6, value.getBasicElectricalEngg());
            ps.setString(7, value.getElectronicEngg());
            ps.setString(8, value.getEnggChemistryLab());
            ps.setString(9, value.getEnggPhysicsLab());
            status=ps.executeUpdate();
             
            ps.close();
            db.getCon().close();
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentResultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentResultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    return status;
    }
    
    public static List<StudentResult> viewAll(){
         List<StudentResult> list=new ArrayList<StudentResult>();
         String sql="select*from studentresult";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                StudentResult t=new StudentResult(
                        rs.getInt("id"),
                        rs.getString("rollNumber"),
                        rs.getString("enggPhysics1"),
                        rs.getString("enggChemistry"), 
                        rs.getString("enggMathematics1"), 
                        rs.getString("basicElectricalEngg"), 
                        rs.getString("electronicEngg"),
                        rs.getString("enggChemistryLab"),
                        rs.getString("enggPhysicsLab")
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
