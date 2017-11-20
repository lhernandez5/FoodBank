/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityfoodbank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author luzhernandez
 */
public class Volunteer extends UserAccount {

    private FoodItem itemsInWarehouse;
    private Perishable perish;
    private ArrayList<String> perishableFoodItems = new ArrayList<>();
    private ArrayList<String> nonPerishableFoodItems = new ArrayList<>();
    private ArrayList<String> sortTheseFoodItems = new ArrayList<>();

    /**
     *
     * @param UserId
     * @param Password
     */
    public Volunteer(String UserId, String Password) {
        //inherit userId and password 
        
        super(UserId, Password);
    }

    /**
     * will allow user to sort items based on whether the item is perishable or nonperishable
     */
    public void sortDonatedFoodItems() {
        //try 
        //  make instance of FoodItem
        //  set items in FoodItemsInWarehouse arraylist
        //  display "The current items we have for you to sort are:"
        //  sortTheseFoodItems is populated with items in FoodItemsInWarehouse arraylist
        //  display sortTheseFoodItems by getting items in FoodItemsInWarehouse arraylist
        //  display sortTheseFoodItems
        //  initialize i to 0
        //  for every item in sortTheseFoodItems arraylist
        //      ask user whether the item is perishable or non perihable
        //      add 1 to i
        //      display "Type 'P'/'p'for perishable and 'N'/'n' for non perishable."
        //      create scanner instance 
        //      if the answer is p 
        //          display "This item is perishable"
        //          add item to perishableFoodItems arraylist
        //      else if user answers n
        //          display "This item is non perishable "
        //          add item to nonPerishableFoodItems arraylist
        //      else
        //          display "Your input was incorrect."
        //          break
        //  display sorted Perishable items
        //  display sorted nonPerishable items
        //  end loop
        // catch mismatch exception
        // display "Your input was incorrect."

        try {
            itemsInWarehouse = new FoodItem();
            itemsInWarehouse.setFoodItemsInWarehouse();
            System.out.println("The current items we have for you to sort are:");
            this.sortTheseFoodItems = itemsInWarehouse.getFoodItemsInWarehouse();
            System.out.println(sortTheseFoodItems);
            System.out.println();
            int i = 0;
            for (String g : sortTheseFoodItems) {
                System.out.println("Is " + sortTheseFoodItems.get(i).toString().toUpperCase() + " perishable or non perishable?");
                i++;
                System.out.println("Type 'P'/'p'for perishable and 'N'/'n' for non perishable.");
                Scanner scanner_1 = new Scanner(System.in);
                char ans = scanner_1.next().charAt(0);
                if (ans == 'p' || ans == 'P') {
                    System.out.println("This item is perishable");
                    perishableFoodItems.add(g);
                    System.out.println();
                } else if (ans == 'n' || ans == 'N') {
                    System.out.println("This item is non perishable ");
                    nonPerishableFoodItems.add(g);
                    System.out.println();
                } else {
                    System.out.println("Your input was incorrect.");
                    break;
                }
            }
            System.out.println("Perishable items you sorted: " + perishableFoodItems);
            System.out.println("Non perishable items you sorted: " + nonPerishableFoodItems);
            System.out.println();
        } catch (InputMismatchException ime) {   //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception 
            System.out.println("Your input was incorrect.");
        }

    }

    /**
     *  allows user to give out food items to families
     */
    public void sendOuttoFamily() {
        //create FoodItem instance 
        //set FoodItemsInWarehouse arraylist
        //display "Lets give out items to families in neeed!""
        //display "To do so you you will be guided step by step through the process of removing items from the warehouse."
        //display "Below is a list of items in the warehouse:"
        //get items from FoodItemsInWarehouse arraylist
        //try
        //  initialize keepgoing to 0 
        //  while user wants to stay in loop 
        //      display "Send out item?"
        //      display "Type 'Y'/'y' for YES and 'N'/'n' for NO."
        //      create scanner instance
        //      scanner takes in a character to decide whether to remove item
        //      if the user chooses y user will be allowed to remove item
        //          display "To remove the next item in line please enter '1'."
        //          scanner will take in integer
        //          if the the first item is removed and the FoodItemsInWarehouse arraylist is not empty 
        //              print the item that was removed
        //              display "The UPDATED list of items in the food bank are below:"
        //              print items that are left in arraylist
        //          else if the first item removed and the FoodItemsInWarehouse arraylist is empty
        //              display "SENDING PROCESS STOPPED BECAUSE YOU HAVE GIVEN OUT ALL OF THE FOOD ITEMS!!"
        //              keepgoing will equal 1 to exit loop
        // catch mismatch exception 
        //    display "Your input was incorrect."

        itemsInWarehouse = new FoodItem();  //creates instance of foodItem
        itemsInWarehouse.setFoodItemsInWarehouse();
        System.out.println("\t\t\tLets give out items to families in neeed!!!");
        System.out.println("To do so you you will be guided step by step through the process of removing items from the warehouse.");
        System.out.println();
        System.out.println("Below is a list of items in the warehouse:");
        System.out.println(itemsInWarehouse.getFoodItemsInWarehouse());
        try {
            int keepGoing = 0; //intializes keepGoing loop to 0
            while (keepGoing == 0) {    //while the user want to stay in loop the loop will repeat
                System.out.println();
                System.out.println("Send out item?");
                System.out.println("Type 'Y'/'y' for YES and 'N'/'n' for NO.");
                Scanner scanner = new Scanner(System.in);   //scanner is created
                char wantToRemove = scanner.next().charAt(0);   //scanner takes in a character
                if (wantToRemove == 'Y' || wantToRemove == 'y') {   //user is asked if he/she wants to remove an item
                    System.out.println("To remove the next item in line please enter '1'.");
                    int remove = scanner.nextInt(); //scanner will take in integer
                    if ((remove == 1) && !(itemsInWarehouse.getFoodItemsInWarehouse().isEmpty())) { //if the answer is 1 and the arrayList is not empty
                        System.out.println(itemsInWarehouse.getFoodItemsInWarehouse().remove(remove - 1) + " was REMOVED from food bank warehouse.");
                        System.out.println("\t\tThe UPDATED list of items in the food bank are below: ");
                        System.out.println(itemsInWarehouse.getFoodItemsInWarehouse()); //print items in arraylist
                    } else if ((remove == 1) && (itemsInWarehouse.getFoodItemsInWarehouse().isEmpty())) {   //if the answer is 1 and the arrayList is empty 
                        System.out.println("SENDING PROCESS STOPPED BECAUSE YOU HAVE GIVEN OUT ALL OF THE FOOD ITEMS!!---------");
                        System.out.println();
                        keepGoing = 1;  //will exit loop
                    }
                } else if (wantToRemove == 'N' || wantToRemove == 'n') {    //user does not want to send out items
                    System.out.println("SENDING PROCESS STOPPED.------------------------------------------");
                    System.out.println();
                    keepGoing = 1;  //will exit loop
                }
            }
        } catch (InputMismatchException ime) {   //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception 
            System.out.println("Your input was incorrect.");
        }
    }

    /**
     *  allows user to throw away items that are expired
     */
    public void throwAway() {
        //create instance of perishable
        //call TakeOUtExpired meethod on perishable

        perish = new Perishable();
        perish.TakeOutExpired();
    }

}
