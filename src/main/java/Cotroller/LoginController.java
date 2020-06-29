/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cotroller;

import View.Login;

/**
 *
 * @author leopoldo
 */
public class LoginController {

    /**
     * The field View is accessible anywhere from this class
     */
    private final Login View;

    public LoginController(Login View) {
        this.View = View;
    }
    
    
    public void enterIntoTheSystem(){
        
        // 1. Get a user in the View
        // 2. Search the User in the Database
        // 3. If the user from View have the same password and user coming from the Database
        // point to Menu -> Redirect to the MainMenu
        // If it's not equal,  shows a message to the user "Password and User invalid".
    }  
    
    
    /**
     * In the Login form, when the bottom submit is clicked
     * and it got the Controller, the Controller demands to show a message.
     * Then the Controller comes back to View and demands View to show a message to the User."
     */
    public void taskDone(){
        System.out.println("A search was done from the Database");
        
        this.View.showMessage("TaskDone has been executed");
    }
    
    
}
