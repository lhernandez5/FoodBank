/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityfoodbank;

import java.text.ParseException;
import java.util.*;
import java.util.InputMismatchException;

/**
 * FoodBank class Contains the logistics to run the food bank system
 *
 * @author luzhernandez
 */
public class FoodBank {

    private Employee employee;
    private Volunteer volunteer;
    private Donor donor;
    private boolean continueWithFoodBank = false;

    /**
     * Constructor
     */
    public FoodBank() {
        //initialization for the food bank
        
        SetUpFoodBank(); 
    }

    /**
     * will set up the welcoming screen The user will be allowed to choose their
     * login type, proceed with their tasks and exit if they please
     *
     */
    public void SetUpFoodBank() {
        //try
        //  display "Welcome to your local community food bank!"
        //  display "Thank you for using our system"
        //  display "First you have to create your login information"
        //  display "When you gain access to an account depending on your status"
        //  display "Your account will allow you do the tasks you wish to get done"
        //  display "You can log in the system as either an employee, a donor, or a volunteer"
        //  call userAccount method
        //  display "Would you like to login again for another task?"
        //  display "Type 'Y'/'y'for yes and 'N'/'n' for no."
        //  create scanner instance
        //  if answer is yes
        //      call userAccount method
        //      loop tp the welcome screen
        //  else if the answer is no
        //      set continueWithFoodBank to false to reset system 
        //      display "THANK YOU FOR CONTRIBUTING TO OUR CAUSE & USING OUR SYSTEM!"
        //      end loop
        //catch mismatch exception
        //  display "Sorry, but that wasn't a number. You have to try agian."

        try {
            //Below are print statements that will print at the welcoming screen
            System.out.println("=============================================================================");
            System.out.println("\t\tWELCOME TO YOU LOCAL COMMUNITY FOOD BANK!");
            System.out.println("=============================================================================");
            System.out.println("\tThank you for using our food bank system");
            System.out.println();
            System.out.println("-----------------------How does the system work?-----------------------------");
            System.out.println("First you have to create your login information.");
            System.out.println("When you gain access to an account depending on your status. ");
            System.out.println("Your account will allow you do the tasks you wish to get done.");
            System.out.println("You can log in the system as either an employee, a donor, or a volunteer.");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println();
            UserAccount();   // getUserAccount method call will be called and allow the user to choose their login type
            System.out.println("Would you like to login again for another task?");  // at the end of the user's task being completed they will be asked if they want to login in back again
            System.out.println("Type 'Y'/'y'for yes and 'N'/'n' for no.");          // as the same user or different one
            Scanner sc = new Scanner(System.in);    //a scanner is created 
            char ans = sc.next().charAt(0); // one characteer either a 'y' or an 'n' will be taken for an answer to the login question 
            if ((ans == 'y') || (ans == 'Y')) { //if the user answers 'y' this loop will run 
                UserAccount();// use the system
                reset(); //will set up the welcome screen again 
                System.out.println();   //blank line
            } else if ((ans == 'n') || (ans == 'N')) {   //otherwise if the user answers 'n' then that will exit the user from the system
                // don't run the setup again
                continueWithFoodBank = false;   //the system will exit if the anser is no
                System.out.println("THANK YOU FOR CONTRIBUTING TO OUR CAUSE & USING OUR SYSTEM!");
            }

        } catch (InputMismatchException ime) {  //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception
            System.out.println("Sorry, but that wasn't a number. You have to try agian.");
        }

    }

    /**
     * displays the options for logging into the food bank system The user will
     * be able to log in as an employee, volunteer, or a donor all of which have
     * their own login logistics
     *
     */
    public void UserAccount() {
        //  try
        //      display "Please select from the following menu of options, by typing a number:"
        //      display "1. EMPLOYEE"
        //      display "2. VOLUNTEER"
        //      display "3. DONOR"
        //      create scanner instance
        //      scanner will take in integer
        //      switch based on user
        //          for case 1
        //              initiate employee login
        //              break
        //          for case 2
        //              initiate volunteer login
        //              break
        //          for case 3
        //              initiate donor login
        //              break
        //          default
        //              display "Sorry, but that wasn't a number. You have to try again"
        //  catch mismatch exception
        //      display "Sorry, but that wasn't a number. You have to try again"

        try {
            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t1. EMPLOYEE");
            System.out.println("\t2. VOLUNTEER");
            System.out.println("\t3. DONOR");
            Scanner scanner = new Scanner(System.in);   //scanner is created to take in user input
            int user = scanner.nextInt();   //scanner will take in an integer
            switch (user) {
                case 1: //if the user types in 1 this option will be chosen
                    employeeLogin();    //this case will direct the system to login method for an employee
                    break;  //loop terminated
                case 2: //if the user types in 2 this option will be chosen
                    volunteerLogin();//this case will direct the system to login method for a volunteer
                    break;  //loop terminated
                case 3: //if the user types in 3 this option will be chosen
                    donateLogin();//this case will direct the system to login method for a donor
                    break;  //loop terminated
                default:    //if another answer is entered besides the ones already mentioned the statement below will print
                    System.out.println("Sorry, but you need to enter a 1, 2, or 3");
            }
        } catch (InputMismatchException ime) { //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception
            System.out.println("Sorry, but that wasn't a number. You have to try agian.");
        }
    }

    /**
     * directs the employee to their login screen where the user
     * will be able to input their password, username, and position The runStats
     * method will be performed for the employee as a result of the login
     */
    public void employeeLogin() {
        //  try
        //      create scanner instance
        //      display "What is your position"
        //      create scanner that takes in a string positon
        //      display "Please enter your username"
        //      create a string scanner that will take in employeeUsername
        //      display "Please enter your password"
        //      create string scanner that takes employeePassword
        //      display "Congrats you just created an account that will be used for the employees password"
        //      run the runStats method for the employee
        // catch mismatch exception
        //      display "Your input was incorrect"

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your position?");
            String position = scanner.next();   //a scanner is created
            System.out.println("Please enter your username(Your first name): ");
            String employeeUsername = scanner.next();   //scanner will be used to take in the username for the employee
            System.out.println("Please enter your password(Create a password of 4 integers): ");    //print statement
            String employeePassword = scanner.next();   //scanner will be used for the employees password
            System.out.println();
            System.out.println("Congrats you just created an account that will grant you access the food bank system!");
            System.out.println();
            employee = new Employee(position, employeeUsername, employeePassword);
            employee.runStats();    //the runstats method will be performed for the employee
        } catch (InputMismatchException ime) {   //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception 
            System.out.println("Your input was incorrect.");    //print statement
        }
    }

    /**
     * directs the volunteer to their login screen where the
     * user will be able to input their password and username The runStats
     * method will be performed for the volunteer as a result of the login
     *
     */
    public void volunteerLogin() {
        //try
        //  create scanner instance
        //  display "Please enter your username(Your first name):"
        //  take in a string Username for volunteer
        //  display "Please enter your password(Create a password of 4 integers): "
        //  take in string password for volunteer
        //  display "Congrats you just created an account that will grant you access the food bank system!"
        //  create volunteer instance that takes in the username and password
        //  display "Type the number of the task you would like to complete."
        //  display "1. SORT ITEMS"
        //  display "2. GIVE OUT ITEMS"
        //  display "3. THROW AWAY EXPIRED"
        //  scanner takes in an integer
        //  if task chosen is the first
        //      display "SORT FOOD ITEMS!"
        //      display "TASK: Help out with sorting the food items."
        //      display "And throw away the food items that have expired."
        //      user call sorDonatedFoodItems method
        //  else if user chooses the second
        //      display "GIVE OUT ITEMS TO THOSE IN NEED!"
        //      display "TASK: Help sending/giving food items in warehouse out those families in need."
        //      display "YOU WILL: Sort food items by whether they are perishable/non-perishable items."
        //      user call the sendOuttoFamily method
        //  else if user chooses the third
        //      display "HELP THROW AWAY EXPIRED ITEMS!"
        //      display "TASK: Throw away perishable food items in warehouse that are expired."
        //      display "OU WILL: Throw away expired item if it will expire within the the next 5 days."
        //      user call the throwAway method
        //      end loop
        //  catch mismatch exception
        //      display "Your input was incorrect."

        try {
            Scanner scanner = new Scanner(System.in);   //a scanner is created
            System.out.println("Please enter your username(Your first name): ");    //print statement
            String volunteerUsername = scanner.next();  // scanner will take in the username 
            System.out.println("Please enter your password(Create a password of 4 integers): ");
            String volunteerPassword = scanner.next();  //sanner will take in the password
            System.out.println();
            System.out.println("Congrats you just created an account that will grant you access the food bank system!");    //print statement
            System.out.println();
            volunteer = new Volunteer(volunteerUsername, volunteerPassword);    //a volunteer object/user is created
            System.out.println();
            System.out.println("Type the number of the task you would like to complete.");  //print statement
            System.out.println("1. SORT ITEMS");    //print statement
            System.out.println("2. GIVE OUT ITEMS");    //print statement
            System.out.println("3. THROW AWAY EXPIRED");    //print statement
            System.out.println();
            int task = scanner.nextInt();   //scanner will take in an integer
            if (task == 1) {    //if the volunteer chooses the first task
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("\t\t\tSORT FOOD ITEMS!");   //print statement
                System.out.println("TASK: Help out with sorting the food items.");  //print statement
                System.out.println("YOU WILL: Sort perishable and non perishable items.");  //print statement
                System.out.println("\tAnd throw away the food items that have expired.");   //print statement
                System.out.println("------------------------------------------------------------------------------");
                volunteer.sortDonatedFoodItems();   //volunteer will be directed to the method that does sorting of food items
            } else if (task == 2) { //if the volunteer chooses the second task
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("\t\t\tGIVE OUT ITEMS TO THOSE IN NEED!");
                System.out.println("TASK: Help sending/giving food items in warehouse out those families in need.");
                System.out.println("YOU WILL: Sort food items by whether they are perishable/non-perishable items.");
                System.out.println("-------------------------------------------------------------------------------");
                volunteer.sendOuttoFamily();    //volunteer will be directed to the method that sends out food items to families
            } else if (task == 3) { //if the volunteer chooses the third task
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("\t\t\tHELP THROW AWAY EXPIRED ITEMS!");
                System.out.println("TASK: Throw away perishable food items in warehouse that are expired.");
                System.out.println("YOU WILL: Throw away expired item if it will expire within the the next 5 days.");
                System.out.println("--------------------------------------------------------------------------------");
                volunteer.throwAway();  //volunteer will be directed to the method that throws away food items that have expired
            }
        } catch (InputMismatchException ime) {   //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception  
            System.out.println("Your input was incorrect.");
        }
    }

    /**
     * allows the donor to input their username and password
     * Also the donor will be able to choose which task they'd like to perform
     */
    public void donateLogin() {
        //  try
        //      create scanner instance
        //      display "Please enter your username:"
        //      create scanner instance for username
        //      display "Please enter your password:"
        //      creat scanner instance for password 
        //      display "Congrats you just created an account that will grant you access the food bank system!"
        //      create donor instance
        //      create scanner instance for donating option
        //      display "Would you like to donate money or food"
        //      display "1. Food"
        //      display "2. Money"
        //      scanner will take in an integer
        //          if user chooses 1
        //              user will be allowed to donate food
        //          else if user chooses 2
        //              user will be allowed to donate money
        //          end of if loop
        //  catch mismatch exception 

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your username(Your first name): ");
            String donorUsername = scanner.next();
            System.out.println("Please enter your password(Create a password of 4 integers): ");
            String donorPassword = scanner.next();
            System.out.println();   //empty line
            System.out.println("Congrats you just created an account that will grant you access the food bank system!");
            System.out.println();   //empty line
            donor = new Donor(donorUsername, donorPassword);    //a volunteer object/user is created
            System.out.println();   //emptyline
            Scanner scanner_1 = new Scanner(System.in);
            System.out.println("Would you like to donate money or food?");
            System.out.println("\t1. Food");
            System.out.println("\t2. Money");
            int donate = scanner_1.nextInt();   //scanner will take in an integer for an answer
            if (donate == 1) {  //if donor chooses 1 then the donor will perform the donate food task
                donor.donateFood(); //donor will be directed to the method that donates food items
            } else if (donate == 2) {   //if donor chooses 2 then the donor will perform the donate money task
                donor.donateMoney();    //donor will be directed to the method that donates money
            }
        } catch (InputMismatchException ime) {   //  the try and catch loop will address issues with errors in user input throws the InputMismatchException exception  
            System.out.println("Your input was incorrect.");
        }
    }

    /**
     * allows for the user to use the system again
     */
    public void reset() {
        //if user wants to continue the loop
        //  user will be allowed to login again

        if (!continueWithFoodBank) {    //if the user wants to continue this loop will be performed
            //will reset system for the user
            UserAccount();  // the userAccount method will run again for the user
        }
    }

}
