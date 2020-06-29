/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


/**
 *
 * @author leopoldo
 */
public class User extends Person {
    
    /**
    * ATTRIBUTES
    */
    protected String password;
    protected String accessLevel;
    

    /**
     * CONSTRUCTOR 
     * @param password
     * @param id
     * @param name 
     */
    public User(int id, String name, String password) {
        super(id, name);
        this.password = password;
    }

    public User(String password, String accessLevel, int id, String name, String DateOfBirth, String phone, String email) {
        super(id, name, DateOfBirth, phone, email);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
    
    
   

}