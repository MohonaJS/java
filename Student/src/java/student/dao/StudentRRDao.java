
package student.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import student.model.StudentMM;
import student.util.DBConnection;

public class StudentRRDao {

    public StudentRRDao() {
    }
    static DBConnection db;
    
    
    public static int save(StudentMM value){
        int status=0;
        String sql="insert into studentrr (rollnumber,enggphysics, enggchemistry, enggmathematics, basicelectricalengg, electronicengg, enggchemistrylab, enggphysicslab) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setInt(1, value.getRollnumber());
            ps.setInt(2, value.getEnggphysics());
            ps.setInt(3, value.getEnggchemistry());
            ps.setInt(4, value.getEnggmathematics());
            ps.setInt(5, value.getBasicelectricalengg());
            ps.setInt(6, value.getElectronicengg());
            ps.setInt(7, value.getEnggchemistrylab());
            ps.setInt(8, value.getEnggphysicslab());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentRRDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentRRDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return status;
    }
    
        public static List<StudentMM> viewAll(){
            List<StudentMM> list= new ArrayList<>();
            String sql="select * from studentrr";
        try {
            PreparedStatement ps1=db.getCon().prepareStatement(sql);
            ResultSet rs=ps1.executeQuery();
            while(rs.next()){
                StudentMM s=new StudentMM(
                        rs.getInt("rollnumber"),
                        rs.getInt("enggphysics"),
                        rs.getInt("enggchemistry"),
                        rs.getInt("enggmathematics"),
                        rs.getInt("basicelectricalengg"),
                        rs.getInt("electronicengg"),
                        rs.getInt("enggchemistrylab"),
                        rs.getInt("enggphysicslab")
                );
            list.add(s);
            
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentRRDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentRRDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        return list;
        }
    
}


