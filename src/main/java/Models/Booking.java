/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leopoldo
 */
public class Booking {
    
    private int id;
    private Customer customer;
    private Service service;
    private float cost;
    private Date date;
    private String notes;

    public Booking(int id, Customer customer, Service service, float cost, String date) {
        this.id = id;
        this.customer = customer;
        this.service = service;
        this.cost = cost;
        try {
            this.date = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(date);
                    } catch (ParseException e){
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
}
