/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityfoodbank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author luzhernandez
 */
public class Perishable extends FoodItem {

    private ArrayList<String> date = new ArrayList<>();
    private ArrayList<String> throwAway = new ArrayList<>();
    private ArrayList<String> pastDueItems = new ArrayList<>();
    private ArrayList<String> perishable = new ArrayList<>();
    private ArrayList<String> removed = new ArrayList<>();
    private ArrayList<String> mergeDateAndPerishable = new ArrayList<>();

    /**
     *
     */
    public Perishable() {
        //set NonPerishable arraylist
        //get NonPerishable arraylist
        //initialize sum to 0
        //for every string in the Perishable arraylist
        //add 1 to the sum
        //end loop
        //display "PERISHABLE ITEMS: " plus the Perishable arraylist
        //display "TOTAL PERISHABLE: " plus the sum of the items 

        this.setPerishable();
        this.getPerishable();
        int sum = 0;
        for (String i : perishable) {
            sum += 1;
        }
        System.out.println("PERISHABLE ITEMS: " + getPerishable());
        System.out.println("TOTAL PERISHABLE: " + sum);
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getPerishable() {
        //return perishable arrraylist
        
        return perishable;
    }

    /**
     *
     */
    public void setPerishable() {
        //add lettuce to the index 3 in the arraylist
        //add tomatoes to the index 4 in the arraylist
        //add eggs to the index 5 in the arraylist
        //add chicken thighs to index 10 in the arraylist

        perishable.add(0, "lettuce");
        perishable.add(1, "tomatoes");
        perishable.add(2, "eggs");
        perishable.add(2, "chicken thighs");
    }

    /**
     *
     * @return
     */
    public List<String> getDate() {
        //return date arraylist
        
        return date;
    }

    /**
     *
     */
    public void setDate() {
        //add 2018-16-06 to the index 0 in the arraylist
        //add 2017-12-28 to the index 1 in the arraylist
        //add 2018-11-20 to the index 2 in the arraylist
        //add 2018-11-18 to index 3 in the arraylist

        date.add(0, "2018-16-06");
        date.add(1, "2017-12-28");
        date.add(2, "2018-11-20");
        date.add(2, "2018-11-18");
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getMergeDateAndPerishable() {
        //reeturn mergeDateAndPerishable arraylist
        
        return mergeDateAndPerishable;
    }

    /**
     *
     */
    public void setMergeDateAndPerishable() {
        // set date arraylist
        // get date arraylist
        // set perishable arraylist
        // get periahable arraylist
        // length equals the size of the date arryalist
        // for every item in the data arraylist 
        //      to the mergeDateAndPerishable add perishable item with its expiration date
        //end loop

        setDate();
        getDate();
        setPerishable();
        getPerishable();
        int length = date.size();
        for (int i = 0; i < length; i++) { // Loop through every item
            mergeDateAndPerishable.add("|" + perishable.get(i).toUpperCase() + " expires " + date.get(i) + "|");
        }
    }

    /**
     *
     */
    public void TakeOutExpired() {
        //set MergeDateAndPerishable arraylist
        //get MergeDateAndPerishable arraylist
        //display "Our perishable items are listed below with their dates of expiration:"
        //print items in mergeDateAndPerishable arraylist
        //try
        //  while initializze keepGoing to 0 
        //      while user chooses to keep loop going
        //      display "THROW OUT ITEM?"
        //      display "Type 'Y'/'y' for YES and 'N'/'n' for NO."
        //      create scanner 
        //      scanner will take in character for wantToRemove variable
        //          if the user wants to remove an item            
        //              diplay "REMOVE item by entering '1' for the FIRST ITEM, '2' for the SECOND ITEM, and so on."
        //              scanner will take in an integer
        //              if input equals itself and the mergeDateAndPerishable arraylist is not empty
        //                  display the item that was REMOVED from food bank warehouse 
        //                  display "UPDATED FOOD BANK ITEMS: "
        //                  initialize e to 1
        //                  for every item in the mergeDateAndPerishable arraylist
        //                      find item at given index in the mergeDateAndPerishable arraylist
        //                      print items in the mergeDateAndPerishable arraylist 
        //              else if input equals itself and the mergeDateAndPerishable arraylist is empty 
        //                  display "SENDING PROCESS STOPPED BECAUSE YOU HAVE GIVEN OUT ALL OF THE FOOD ITEMS!!"
        //                  make keepGoing equql to 1
        //          else if user doesn't want to remove an item
        //              display ""SENDING PROCESS STOPPED."
        //              display "THANK YOU!"
        //              keepGoing variable equals 1
        //              end loop
        //catch mismatch exception
        //  display "Your input was incorrect."

        setMergeDateAndPerishable();
        getMergeDateAndPerishable();
        System.out.println();
        System.out.println("Our perishable items are listed below with their dates of expiration: ");
        System.out.println();
        System.out.println(mergeDateAndPerishable);
        try {
            int keepGoing = 0;
            System.out.println();
            while (keepGoing == 0) {
                System.out.println("THROW OUT ITEM?");
                System.out.println("Type 'Y'/'y' for YES and 'N'/'n' for NO.");
                Scanner scanner = new Scanner(System.in);
                char wantToRemove = scanner.next().charAt(0);
                if (wantToRemove == 'Y' || wantToRemove == 'y') {
                    System.out.println("REMOVE item by entering '1' for the FIRST ITEM, '2' for the SECOND ITEM, and so on.");
                    int remove = scanner.nextInt();
                    if ((remove == remove) && !(mergeDateAndPerishable.isEmpty())) {
                        System.out.println(mergeDateAndPerishable.remove(remove - 1) + " was REMOVED from food bank warehouse.");
                        System.out.println();
                        System.out.println("UPDATED FOOD BANK ITEMS: ");
                        int e = 1;
                        for (int i = 0; i < mergeDateAndPerishable.size(); i++) { // Loop through every item
                            mergeDateAndPerishable.indexOf(i);
                            e++;
                        }
                        System.out.println(mergeDateAndPerishable);
                        System.out.println();
                    } else if ((remove == remove) && (mergeDateAndPerishable.isEmpty())) {
                        System.out.println("SENDING PROCESS STOPPED BECAUSE YOU HAVE GIVEN OUT ALL OF THE FOOD ITEMS!!---------");
                        System.out.println();
                        keepGoing = 1;
                    }
                } else if (wantToRemove == 'N' || wantToRemove == 'n') {
                    System.out.println("SENDING PROCESS STOPPED.------------------------------------------");
                    System.out.println("THANK YOU!");
                    System.out.println();
                    keepGoing = 1;
                }
            }
        } catch (InputMismatchException ime) {   //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception  
            System.out.println("Your input was incorrect.");
        }
    }

}
