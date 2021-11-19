
package webtest7.model;


public class Student {

    public Student() {
    }
     
    private int id;
    
    private String name;
    private String email;
    private String age;
    private String subject;
    private String gender;

    public Student(int id, String name, String email, String age, String subject, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.subject = subject;
        this.gender = gender;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
    
    
    
}
