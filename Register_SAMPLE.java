//PROVIDED ONLY AS SAMPLE CODE TO WORK FROM, 
//THIS REGISTER FILE IS *NOT* Part of your submission
//
//
/* This is a java file 'stub' or piece of a file designed to get you started on 
* learning to code in java, while at the same time, exploring a little more about
* collaboration, version control and multiple file scenarios.
*
*For this assignment, use the following code as helper files, you will create classes Kiosk and Printer for this time.
* 
*   1. Leave this comment header block in place, but replace elements of name, date and
*         project name with your own (remmber you cannot change file or class name.
*   2. Imagine the following scenario and design your software to complete the following:
*        a. Using the concole window (AKA terminal screen) design a POS (Point of Sale System) printer
*        b. You are to generate a printed receipt for a Point of sale system, that includes:
*             i.   Line separation headers   i.e. *********************************'
*             ii.  ASCII simple art for a box around name of Store, location, date of transaction
*             iii. line for cashier user account logged in
*             iv.  transaction details for at least three items purchases in POS recent memory
*             v.   lines for subtotals, tax, and total amound due as well as tender type and 
*             vi.  where necessary, change due or a mock credit card number (last 4 digits and expiry date
*       c. Menu system for your POS (Point of Sale) operation could include more static elements like:
*             i.   Variation of tax amount
*             ii.  user login, store number
*             iii. seasonal or promotional message that could change from time to time.
*
* That's a good start.
*/

import java.util.Scanner;

public class Register {

//this could be the interactions for the user, that may include login, custom message, etc.
// a menu system may call upon the transaction 'window' or screen
// then you could call up a receipt printer function.

public static void Register() 
  {
    Scanner scan = new Scanner(System.in);
    //main menu system
    
    int Walmart = 15;
    int Kroger = 20;
    int Wholefoods = 4;
    int Target = 10;
    int Dot = 100; 
    double price = 0;
    double tax = 0;
    
    
     System.out.println("");
     System.out.println("Welcome to martMART the store to buy your stores");
     System.out.println("");
     System.out.print("Do you wish to check out, yes or no: ");
     String quest = scan.nextLine();
     
     if(quest.equals("yes"))
     {
       System.out.println("");
       System.out.println("Then you are in the right place.");
       
       System.out.println("");
       
       System.out.println("What are you checking out. stuff or stores.");
       
       System.out.println("");
       
       String stuffrstore = scan.nextLine();
          if(stuffrstore.equals("stores"))
          {
            System.out.println("");
            System.out.println("What store are you checking out. your choices are");
            System.out.println("");              
            System.out.println("Walmart");
            System.out.println("WholeFoods");
            System.out.println("Kroger");
            System.out.println("Target");
            System.out.println(".");

            System.out.println("");

            System.out.println("What store would you like to purchase:");

            String store = scan.nextLine();

            if(store.equals("Walmart"))
            {
              System.out.println("");
              System.out.println("Enter the tax rate: ");

              tax = scan.nextDouble();

              System.out.println("");

              price = tax * Walmart;

             System.out.println("****************************************");
             System.out.println("*Tax: " + tax + "                              *");
             System.out.println("*Price: " + Walmart + "                             *");
             System.out.println("*Price: " + price + "                            *");
             System.out.println("****************************************");
            
            } else
            {

              System.out.println("Sorry we are out of " + store);

            } 

          } else 
            {

              System.out.println("Sorry we are out of stuff");

            }


     }else{
       System.out.println("Then why are you here?");
       

     }
    // how will you call upon or implement other classes?
    
    }  //close main method

}  // close the class

public class Register {

//this could be the interactions for the user, that may include login, custom message, etc.
// a menu system may call upon the transaction 'window' or screen
// then you could call up a receipt printer function.

public static void main (String[] args) {

    //main menu system
    // how will you call upon or implement other classes?
    
    }  //close main method

}  // close the class
