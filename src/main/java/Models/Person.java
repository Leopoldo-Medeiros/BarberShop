/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leopoldo
 */
abstract public class Person {
    
    protected int id;
    protected String name;
    protected String DateOfBirth;
    protected String phone;
    protected String email;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, String DateOfBirth, String phone, String email) {
        this.id = id;
        this.name = name;
        try{
            this.DateOfBirth = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(DateOfBirth);
        } catch (ParseException e)  {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, e);
        }
        
        this.phone = phone;
        this.email = email;
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

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
