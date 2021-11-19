
package studentmanagement2.model;

public class Smanagement {
   private String coursename; 
   private String branchname; 
   private String rollnumber; 
   private String name; 
   private String fathername; 
   private String gender; 

    public Smanagement() {
    }
   
   

    public Smanagement(String coursename, String branchname, String rollnumber, String name, String fathername, String gender) {
        this.coursename = coursename;
        this.branchname = branchname;
        this.rollnumber = rollnumber;
        this.name = name;
        this.fathername = fathername;
        this.gender = gender;
    }
   
   

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   
   
   
}
