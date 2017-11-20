/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityfoodbank;

import java.util.ArrayList;

/**
 *
 * @author luzhernandez
 */
public class NonPerishable extends FoodItem {

    private ArrayList<String> nonPerishable = new ArrayList<>();    

    /**
     * Constructor
     */
    public NonPerishable() {
        //set NonPerishable arraylist
        //get NonPerishable arraylist
        //initialize sum to 0
        //for every string in the NonPerishable arraylist
        //display "NON PERISHABLE ITEMS: " plus the NonPerishable arraylist
        //end loop
        //display "TOTAL NON PERISHABLE: " plus the sum of the items 
        
        this.setNonPerishable();
        this.getNonPerishable();
        int sum = 0;
        for (String i : getNonPerishable()) {
            sum += 1;
        }
        System.out.println("NON PERISHABLE ITEMS: " + nonPerishable);
        System.out.println("TOTAL NON PERISHABLE: " + sum);
    }

    /**
     * 
     * @return 
     */
    public ArrayList<String> getNonPerishable() {
        //delcare nonPerishable arraylist
        
        return this.nonPerishable;
    }

    /**
     * 
     */
    public void setNonPerishable() {
        //add pasta to the index 0 in arraylist
        //add canned tuna to the index 1 in the arraylist
        //add canned fruit to the index 2 in the arraylist
        //add flour to the index 4 in the arraylist
        //add peanut butter index 5 in the arraylist
        //add oatmeal to index 6 in the arraylist
        //add canned corn to index 9 in the arraylist
        
        this.nonPerishable.add(0, "pasta");
        this.nonPerishable.add(1, "canned tuna");
        this.nonPerishable.add(2, "canned fruit");
        this.nonPerishable.add(3, "flour");
        this.nonPerishable.add(4, "peanut butter");
        this.nonPerishable.add(5, "oatmeal");
        this.nonPerishable.add(6, "canned corn");
    }

}
