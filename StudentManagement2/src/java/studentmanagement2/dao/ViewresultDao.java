
package studentmanagement2.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static studentmanagement2.dao.SmanagementDao.db;
import studentmanagement2.model.Smanagement;
import studentmanagement2.model.Viewresult;
import studentmanagement2.util.DBConnection;


public class ViewresultDao {

    public ViewresultDao() {
    }
    
    static DBConnection db;
    
    public static int save(Viewresult value){
        int status=0;
        String sql="insert into viewresult (rollnumber,enggphysics, enggchemistry, enggmathematics, basicelectricalengg, electronicengg, enggchemistrylab,  enggphysicslab) values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ps.setString(1, value.getRollnumber());
            ps.setString(2, value.getEnggphysics());
            ps.setString(3, value.getEnggchemistry());
            ps.setString(4, value.getEnggmathematics());
            ps.setString(5, value.getBasicelectricalengg());
            ps.setString(6, value.getElectronicengg());
            ps.setString(7, value.getEnggchemistrylab());
            ps.setString(8, value.getEnggphysicslab());
            status=ps.executeUpdate();
            ps.close();
            db.getCon().close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewresultDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ViewresultDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return status;
    }
    
     public static List<Viewresult> viewAll(){
         List<Viewresult> list=new ArrayList<Viewresult>();
         String sql="select * from viewresult";
        try {
            PreparedStatement ps=db.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Viewresult v=new Viewresult(
                       
                        rs.getString("rollnumber"),
                        rs.getString("enggphysics"),
                        rs.getString("enggchemistry"), 
                        rs.getString("enggmathematics"), 
                        rs.getString("basicelectricalengg"), 
                        rs.getString("electronicengg"),
                        rs.getString("enggchemistrylab"),
                        rs.getString("enggphysicslab")
                );
                
                list.add(v);
            
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Smanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Smanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     
     
     return list;
     }
    
    
    
}
