/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest6.model;

/**
 *
 * @author chowd
 */
public class Result {
    
    private int id;
    private String name;
    private String email;
    private String address;
    private String password;
    private String district;

  
    public Result(int id, String name, String email, String address, String password, String district) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
        this.district = district;
    }

    public Result() {
    }

    public Result(int aInt, String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    
}
