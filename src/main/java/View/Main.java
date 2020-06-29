/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Models.Booking;
import Models.Customer;
import Models.Service;
import Models.User;
 
/**
 *
 * @author leopoldo
 */
public class Main {
    
    
    public static void main(String[] args){
        
        String name = "Leo";
        System.out.println(name);
        
        Service service = new Service(1, "beard", 30);
        
        System.out.println(service.getDescription());
        System.out.println(service.getCost());
        
        Customer customer = new Customer(1, "Bruno", "CCT Street 346", "12345678");
        System.out.println(customer.getName());
        
        User user = new User(1, "barber", "senha");
        System.out.println(user.getName());
        
        /**
         * The parameters for Booking are objects type: customer and service.
         */
        Booking booking = new Booking(1, customer, service, 20, "15/04/2020 11:30");
        
        /**
         * It prints the customer's name that booked an appointment
         */
        System.out.println(booking.getCustomer().getName());
    }
    
}
