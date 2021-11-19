
package studentmanagement2.model;


public class Viewresult {

private String rollnumber;
private String enggphysics;
private String enggchemistry;
private String enggmathematics;
private String basicelectricalengg;
private String electronicengg;
private String enggchemistrylab;
private String enggphysicslab;

    public Viewresult() {
    }



    public Viewresult(String rollnumber, String enggphysics, String enggchemistry, String enggmathematics, String basicelectricalengg, String electronicengg, String enggchemistrylab, String enggphysicslab) {
        this.rollnumber = rollnumber;
        this.enggphysics = enggphysics;
        this.enggchemistry = enggchemistry;
        this.enggmathematics = enggmathematics;
        this.basicelectricalengg = basicelectricalengg;
        this.electronicengg = electronicengg;
        this.enggchemistrylab = enggchemistrylab;
        this.enggphysicslab = enggphysicslab;
    }



    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getEnggphysics() {
        return enggphysics;
    }

    public void setEnggphysics(String enggphysics) {
        this.enggphysics = enggphysics;
    }

    public String getEnggchemistry() {
        return enggchemistry;
    }

    public void setEnggchemistry(String enggchemistry) {
        this.enggchemistry = enggchemistry;
    }

    public String getEnggmathematics() {
        return enggmathematics;
    }

    public void setEnggmathematics(String enggmathematics) {
        this.enggmathematics = enggmathematics;
    }

    public String getBasicelectricalengg() {
        return basicelectricalengg;
    }

    public void setBasicelectricalengg(String basicelectricalengg) {
        this.basicelectricalengg = basicelectricalengg;
    }

    public String getElectronicengg() {
        return electronicengg;
    }

    public void setElectronicengg(String electronicengg) {
        this.electronicengg = electronicengg;
    }

    public String getEnggchemistrylab() {
        return enggchemistrylab;
    }

    public void setEnggchemistrylab(String enggchemistrylab) {
        this.enggchemistrylab = enggchemistrylab;
    }

    public String getEnggphysicslab() {
        return enggphysicslab;
    }

    public void setEnggphysicslab(String enggphysicslab) {
        this.enggphysicslab = enggphysicslab;
    }



    
}
