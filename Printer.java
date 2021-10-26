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
*/

//prints out receipt using synced arrays and for loops
public class Printer{
    //use of arrays helps me more efficiently write code to print and store values
    int[] items = new int[5];
    int [] prices = {2, 3, 4, 5, 1};
    String[] names = {"Applejuice", "Sprite", "Caprisun", "Gatorade", "Water"};
	
    double tax = .07;
    double subTotal = 0;
//Printer object simply allows the user purchases to be passed through to this class
    public Printer(int[] purchased){
        items = purchased;
    }
//this function handles the actual printing of the receipt, using for loops, arrays, and subtraction to get the job done
    public void printReceipt(){
        System.out.println("THANKS FOR SHOPPING AT DAN'S");
        System.out.println("HERE IS YOUR RECEIPT:");
        System.out.println("----------------------------------------");
        System.out.println("Quantity      Name                 Price");
        System.out.println("----------------------------------------");
        //looping to display each beverage with their own data
        for(int i = 0; i<5; i++){
            if(items[i] != 0){
                //uses subtraction to print supplementary amount of spaces (I call them dashes)
                int spaces = 21 - names[i].length();
                String dashes = "";
                for(int j = 0; j<spaces; j++){
                    dashes = dashes + " "; 
                }
                System.out.println(items[i] + "             " + names[i] + dashes + "$"+ items[i]*prices[i]);
                subTotal += items[i]*prices[i];
            }
        }
        System.out.println("Subtotal: $" + String.format("%.2f",subTotal));
        System.out.println("Tax: $"+String.format("%.2f",subTotal*tax)+" (7%)");
        System.out.println("Total: $" + String.format("%.2f",(subTotal + (subTotal*tax))));
    }
}
