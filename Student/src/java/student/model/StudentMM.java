
package student.model;


public class StudentMM {
   private int rollnumber;
    private int enggphysics;
    private int enggchemistry;
    private int enggmathematics;
    private int basicelectricalengg;
    private int electronicengg;
    private int enggchemistrylab;
    private int enggphysicslab;

    public StudentMM() {
    }
    
    

    public StudentMM(int rollnumber, int enggphysics, int enggchemistry, int enggmathematics, int basicelectricalengg, int electronicengg, int enggchemistrylab, int enggphysicslab) {
        this.rollnumber = rollnumber;
        this.enggphysics = enggphysics;
        this.enggchemistry = enggchemistry;
        this.enggmathematics = enggmathematics;
        this.basicelectricalengg = basicelectricalengg;
        this.electronicengg = electronicengg;
        this.enggchemistrylab = enggchemistrylab;
        this.enggphysicslab = enggphysicslab;
    }
    
    

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int getEnggphysics() {
        return enggphysics;
    }

    public void setEnggphysics(int enggphysics) {
        this.enggphysics = enggphysics;
    }

    public int getEnggchemistry() {
        return enggchemistry;
    }

    public void setEnggchemistry(int enggchemistry) {
        this.enggchemistry = enggchemistry;
    }

    public int getEnggmathematics() {
        return enggmathematics;
    }

    public void setEnggmathematics(int enggmathematics) {
        this.enggmathematics = enggmathematics;
    }

    public int getBasicelectricalengg() {
        return basicelectricalengg;
    }

    public void setBasicelectricalengg(int basicelectricalengg) {
        this.basicelectricalengg = basicelectricalengg;
    }

    public int getElectronicengg() {
        return electronicengg;
    }

    public void setElectronicengg(int electronicengg) {
        this.electronicengg = electronicengg;
    }

    public int getEnggchemistrylab() {
        return enggchemistrylab;
    }

    public void setEnggchemistrylab(int enggchemistrylab) {
        this.enggchemistrylab = enggchemistrylab;
    }

    public int getEnggphysicslab() {
        return enggphysicslab;
    }

    public void setEnggphysicslab(int enggphysicslab) {
        this.enggphysicslab = enggphysicslab;
    }
    
    
}
