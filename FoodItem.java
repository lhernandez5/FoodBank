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
public class FoodItem {

    private ArrayList<String> foodItemsInWarehouse = new ArrayList<>(); 

    public ArrayList<String> getFoodItemsInWarehouse() {
        //declare foodItemsInWarehouse arraylist
        
        return this.foodItemsInWarehouse;
    }

    public void setFoodItemsInWarehouse() {
        //add pasta to the index 0 in arraylist
        //add canned tuna to the index 1 in the arraylist
        //add canned fruit to the index 2 in the arraylist
        //add lettuce to the index 3 in the arraylist
        //add tomatoes to the index 4 in the arraylist
        //add eggs to the index 5 in the arraylist
        //add flour to the index 6 in the arraylist
        //add peanut butter index 7 in the arraylist
        //add oatmeal to index 8 in the arraylist
        //add canned corn to index 9 in the arraylist
        //add chicken thighs to index 10 in the arraylist

        this.foodItemsInWarehouse.add(0, "pasta");
        this.foodItemsInWarehouse.add(1, "canned tuna");
        this.foodItemsInWarehouse.add(2, "canned fruit");
        this.foodItemsInWarehouse.add(3, "lettuce");
        this.foodItemsInWarehouse.add(4, "tomatoes");
        this.foodItemsInWarehouse.add(5, "eggs");
        this.foodItemsInWarehouse.add(6, "flour");
        this.foodItemsInWarehouse.add(7, "peanut butter");
        this.foodItemsInWarehouse.add(8, "oatmeal");
        this.foodItemsInWarehouse.add(9, "canned corn");
        this.foodItemsInWarehouse.add(10, "chicken thighs");

    }
}
