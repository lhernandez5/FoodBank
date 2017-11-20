/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityfoodbank;

/**
 * The UserAccount class creates UserAccount instance
 *
 * @author luzhernandez
 */
public class UserAccount {

    private String username;    
    private String password;   

    /**
     * Constructor
     *
     * @param username
     * @param password
     */
    public UserAccount(String username, String password) {
        //declare username 
        //declare password
        //print out the username and password for user
        
        this.username = username;
        this.password = password;
        System.out.println("Your username is " + username + ". " + "Your password is " + password + ".");   //prints username and password of account
    }

    /**
     * will get the username for the user
     *
     * @return username
     */
    public String getusername() {
        //return username
        
        return username;    
    }

    /**
     * will set the username for the user
     *
     * @param username
     */
    public void setusername(String username) { 
        //declare username
        
        this.username = username;
    }

    /**
     * will set the password for the user
     *
     * @return password
     */
    public String getpassword() {
        //return password
        
        return password;    
    }

    /**
     * will set the password for the user
     *
     * @param password
     */
    public void setpassword(String password) {
        //declare password
        
        this.password = password;
    }

}
