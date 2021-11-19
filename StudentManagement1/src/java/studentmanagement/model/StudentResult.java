/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.model;

/**
 *
 * @author chowd
 */
public class StudentResult {
    
    private int id;
    private String rollNumber;
    private String enggPhysics1;
    private String enggChemistry;
    private String enggMathematics1;
    private String basicElectricalEngg;
    private String electronicEngg;
    private String enggChemistryLab;
    private String enggPhysicsLab;

    public StudentResult() {
    }
    
    
    

    public StudentResult(int id, String rollNumber, String enggPhysics1, String enggChemistry, String enggMathematics1, String basicElectricalEngg, String electronicEngg, String enggChemistryLab, String enggPhysicsLab) {
        this.id = id;
        this.rollNumber = rollNumber;
        this.enggPhysics1 = enggPhysics1;
        this.enggChemistry = enggChemistry;
        this.enggMathematics1 = enggMathematics1;
        this.basicElectricalEngg = basicElectricalEngg;
        this.electronicEngg = electronicEngg;
        this.enggChemistryLab = enggChemistryLab;
        this.enggPhysicsLab = enggPhysicsLab;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getEnggPhysics1() {
        return enggPhysics1;
    }

    public void setEnggPhysics1(String enggPhysics1) {
        this.enggPhysics1 = enggPhysics1;
    }

    public String getEnggChemistry() {
        return enggChemistry;
    }

    public void setEnggChemistry(String enggChemistry) {
        this.enggChemistry = enggChemistry;
    }

    public String getEnggMathematics1() {
        return enggMathematics1;
    }

    public void setEnggMathematics1(String enggMathematics1) {
        this.enggMathematics1 = enggMathematics1;
    }

    public String getBasicElectricalEngg() {
        return basicElectricalEngg;
    }

    public void setBasicElectricalEngg(String basicElectricalEngg) {
        this.basicElectricalEngg = basicElectricalEngg;
    }

    public String getElectronicEngg() {
        return electronicEngg;
    }

    public void setElectronicEngg(String electronicEngg) {
        this.electronicEngg = electronicEngg;
    }

    public String getEnggChemistryLab() {
        return enggChemistryLab;
    }

    public void setEnggChemistryLab(String enggChemistryLab) {
        this.enggChemistryLab = enggChemistryLab;
    }

    public String getEnggPhysicsLab() {
        return enggPhysicsLab;
    }

    public void setEnggPhysicsLab(String enggPhysicsLab) {
        this.enggPhysicsLab = enggPhysicsLab;
    }
    
    
    
    
    
}

    
    

 
    

 

