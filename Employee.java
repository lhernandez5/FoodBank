/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityfoodbank;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author luzhernandez
 */
public class Employee extends UserAccount {

    private String position;
    private String username;
    private String password;
    private FoodItem itemsInWarehouse;
    private int money;
    private Perishable perishable;
    private NonPerishable nonPerishable;

    /**
     * Constructor
     *
     * @param position
     * @param username
     * @param password
     */
    public Employee(String position, String username, String password) {
        //inherits username and password
        //declare position
        //print out the position
        
        super(username, password);
        this.position = position;
        System.out.println("Position:" + position);  
    }

    /**
     * getPosition will get the position
     *
     * @return
     */
    public String getPosition() {
        //return position
        
        return position;   
    }

    /**
     * setPosition will set the employee's position
     *
     * @param position
     */
    public void setPosition(String position) {
        //declare position
        
        this.position = position;
    }

    /**
     * will print the statistics of the food bank for the employee
     *
     */
    public void runStats() {
        //  empty line
        //  create an instance of the randomGenerator
        //  randomGenerator will generate a number from 0 to 999 and add 10000
        //  money will be assigned to the generated random number
        //  will print the total money donation
        //  create instance of FoodItem
        //  set items in FoodItemsInWarehouse
        // display "ITEMS DONATED SUMMARY:  plus items in FoodItemsInWarehouse"
        //  initialize sum to 0 
        //  for every string in FoodItemsInWarehouse
        //      to the sum add 1
        //  display "TOTAL ITEMS DONATED: plus the sum"
        //  create NonPerishable instance
        //  create Perishable instance

        System.out.println();   
        Random randomGenerator = new Random();  //declaration for randomGenerator
        int randomInt = randomGenerator.nextInt(10000) + 10000; //will generate a number from 0 to 999 and add 10000

        money = randomInt;  //money will be assigned to the generated random number
        System.out.println("TOTAL MONETARY DONATIONS: $" + money);  //will print the total money donation
        System.out.println(); 
        itemsInWarehouse = new FoodItem();  //will make a food item object
        itemsInWarehouse.setFoodItemsInWarehouse(); //will set the items in the foodItemsInWarehouse arraylist
        System.out.println("ITEMS DONATED SUMMARY: " + itemsInWarehouse.getFoodItemsInWarehouse()); //will print the items that are in the foodItemsInWarehouse arraylist
        int sum = 0;    //sum is intialized to 0
        for (String i : itemsInWarehouse.getFoodItemsInWarehouse()) {   //this for loop will get every item in the FoodItemsInWarehouse and add them
            sum += 1;   //will add 1 for every item in the arraylist
        }
        System.out.println("TOTAL ITEMS DONATED: " + sum);  //prints the sum
        System.out.println();  
        nonPerishable = new NonPerishable();    //makes a NonPerishable instance
        System.out.println();   
        perishable = new Perishable();  //makes a NonPerishable instance
        System.out.println();   
    }

}
