/*
PROCESS:
- I knew I needed to create a Printer class and pass variables through from the Kiosk class to start via a Printer object
- I also soon found that I should use recursion to re-ask what the customer wants to buy if they buy more than 9 things
- I first types out all the drinks and their costs, then called the Ask() function (which took very long to write out, and I 
would later replace my "hardcoded" code with a simple for loop), and made sure to call a Printer object and pass through an
array of items (or integers that represented the number of an item bought)
- I also started the Printer class, making an object to receive the purchased items and starting a for loop for printing the receipt out
- I LEARNED VERY QUICKLY THAT FOR LOOPS AND ARRAYS WERE THE WAY TO GO (partly because I made a similar website over the summer: https://bedwarstats.com)
- ^^^ I did all of the above during class ^^^
- Now having an hour to debug and change my code, starting with the Printer class, I used 3 arrays:
one for the names of the items, one for the prices, and one for the quantity bought
- I then used for loops to use all the data and print it out more efficiently and economically than if i were to not use arrays
- I also used subtraction to print a supplementary number of spaces so everything was lined up in the receipt
- I then used the same use of for loops and those same arrays to make my Ask() function in the Kiosk class shorter
- I then added finishing touches: printing out subtotal, total (with tax), made interface look nicer, etc.
- During class, Twyford said to line up the subtotal, tax, and total, and also change the max items function and make it easier to change what items are available
- So I did all that, creating another for loop to make sure everything lines up to the decimal point. 
*/

import java.util.Scanner;
//this is the main/tester class and handles the UI and passes user purchases to the printer class
public class Kiosk{
//the main function simply introduces the store and allows the player to continue to shop for beverages
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("Welcome to Dan's Beverage Store! We have a lot of refreshing drinks for sale today!");
    System.out.print("Press Enter to Continue: ");
    String next = scan.nextLine();
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    Ask();
  }
//this function asks the customer what items they would like to buy using for loops and arrays, each with matching data
//it also passes the customer's purchases to the Printer class to be printed
  public static void Ask(){
    Scanner scan = new Scanner(System.in);

    //use of arrays helps me more efficiently write code to print and store values
    //this also makes it easy to change or add items efficiently
    int[] purchased = new int[5];
    double [] prices = {2, 3, 4, 5, 1};
    String[] names = {"Applejuice", "Sprite", "Caprisun", "Gatorade", "Water"};
    double tax = .07;

    int counter = 0;
    //looping to ask and store the same info for each beverage
    for (int i = 0; i<5; i++){
		
        System.out.println(names[i] + " is selling for $" + String.format("%.2f",prices[i]));
        System.out.print("How much do you wanna buy?: ");
        purchased[i] = scan.nextInt();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        if(purchased[i] > 9){
			System.out.println("Whoops! It looks like you bought more than 9 of this item! Buy again...");
			i--;
		}
    }
     Printer print = new Printer(purchased, prices, names, tax);
     print.printReceipt();
  }
}
