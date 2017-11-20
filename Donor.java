/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityfoodbank;

import java.util.*;

/**
 * This class will create a Donor instance
 *
 * @author luzhernandez
 */
public class Donor extends UserAccount {

    private ArrayList<String> donatedFoodItems = new ArrayList<>();
    private ArrayList<Integer> amountOfFoodItems = new ArrayList<>();

    /**
     * Constructor
     *
     * @param username
     * @param password
     */
    public Donor(String username, String password) {
        //inherit username and password
        
        super(username, password);
    }

    /**
     * will allow the donor user to donate food
     */
    public void donateFood() {
        //try 
        //  create scanner instance
        //  display "("How many food items do you plan on donating"
        //  scanner will takes in an integer
        //  for every element in the numOfFoodItems arraylist
        //      display every Food Item
        //      scanner created
        //      sanner will take a string
        //      scanner will take another string if user enters another
        //      add the food item that is donated to the donatedFoodItems arraylist
        //      display "How many " + foodItem + " did you want to donate? "
        //      scanner will in take in the food item amount
        //      the amount of food items will be added to  the amountOfFoodItems arrayList
        //  end of for loop
        //  initialize sum to 0
        //  for every item in the arraylist
        //      add 1 to sum for every item added
        //       print the donated items arraylist
        //      number of donated items
        //      display "THANK YOU FOR YOUR GENEROUS CONTRIBUTION!"
        //      end loop
        //catch mismatch exception
        //  display "Your input was incorrect."

        try {
            Scanner scanner_1 = new Scanner(System.in); //scanner created
            System.out.println("How many food items do you plan on donating?");
            int numOfFoodItems = scanner_1.nextInt();   //scanner_1 will take in an integer
            for (int j = 1; j <= numOfFoodItems; j++) {
                System.out.println("Food Item " + j + ": ");
                Scanner scanner_2 = new Scanner(System.in); //scanner created
                String foodItem = scanner_2.next();     //sanner_2 will take a string
                foodItem += scanner_2.nextLine();   //keeps the donors string input together 
                donatedFoodItems.add(new String(foodItem)); //will add the food item that is donated to the donatedFoodItems arraylist
                System.out.println("How many " + foodItem + " did you want to donate? ");   //print line
                int amountOfTheFoodItem = scanner_2.nextInt();  // sanner_2 will take in the food item amount 
                amountOfFoodItems.add(new Integer(amountOfTheFoodItem));    //the amount of food items will be added to  the amountOfFoodItems arrayList 
            }
            int sum = 0;
            for (int i : amountOfFoodItems) {
                sum += i;
            }
            System.out.println("You donated: " + donatedFoodItems); // this line will print the donated items arraylist
            System.out.println("Total number of items you donated: " + sum + " items.");    //print line will print the number of donated items
            System.out.println("THANK YOU FOR YOUR GENEROUS CONTRIBUTION!");
            System.out.println();
        } catch (InputMismatchException ime) {   //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception 
            System.out.println("Your input was incorrect.");    //print line
        }

    }

    /**
     * will allow the donor user to donate food
     */
    public void donateMoney() {
        //try
        //  display "How much money do you want to donate?"
        //  create scanner instance
        //  display "You donated  plus money"
        //  display "THANK YOU FOR YOUR GENEROSITY!"
        //catch mismatch exception
        //  display "Your input was incorrect." 

        try {
            System.out.println("How much money do you want to donate?");
            Scanner scanner_3 = new Scanner(System.in);
            int money = scanner_3.nextInt();
            System.out.println("You donated $" + money + ".");
            System.out.println("THANK YOU FOR YOUR GENEROSITY!");
            System.out.println();
        } catch (InputMismatchException ime) {   //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception  
            System.out.println("Your input was incorrect.");
        }
    }

}
