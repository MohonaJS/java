
package studentmanagement.model;


public class StudentManagement {
    private int id;
    private String courseName;
    private String branchName;
    private String rollNumber;
    private String name;
    private String fatherName;
    private String gender;
    
    
    public StudentManagement() {
    }

    public StudentManagement(int id, String courseName, String branchName, String rollNumber, String name, String fatherName, String gender) {
        this.id = id;
        this.courseName = courseName;
        this.branchName = branchName;
        this.rollNumber = rollNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.gender = gender;
    }
    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
