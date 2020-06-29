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
public class Customer extends Person {
    
    /**
     * ATTRIBUTES
     */
    private String email;
    private String address;

    /**
     *
     * @param email
     * @param address
     * @param id
     * @param name
     * @param DateOfBirth
     * @param phone
     */
    public Customer(String email, String address, int id, String name, String DateOfBirth, String phone) {
        super(id, name, DateOfBirth, phone, email);
        this.email = email;
        this.address = address;
    }

    public Customer(int id, String name, String email, String address) {
        super(id, name);
        this.email = email;
        this.address = address;
    }

    /**
     * GETTERS AND SETTERS
     * @return 
     */
    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
   
     

    
    
   
    
}
