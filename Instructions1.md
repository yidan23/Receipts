AP Computer Science 
Unit Quiz- - Classes and Printing Strings:  Receipt


PART 1 – On paper, create at least two classes to solve the following problem.  Classes Kiosk.java and Printer.java

OBJECTIVE:  the main objectives of this assignment are (1) using two classes together, passing back and/or forth 
parameters or arguments to needed constructors and methods.  Kiosk will print basic instructions and a list of
 possible items to choose from and prompt the user about what they want to buy.
When purchases are complete, (2) program should send info to the printer or printer methods.  
Finally – the printer should manage output of a receipt that is 40 characters wide. (3) Implement printing efficiently.

Though some of this will be abstracted and a little contrived, try not to overthink or over-code.  
For example – enforcing users to input correctly is not required on this assignment (No need to check 
if they entered the information correctly – assume, FOR THIS ASSIGNMENT – that info is correctly entered.

The following guidance is provided to help you build your code.  Sample code provided does not override 
these instructions, simply provides you notes, etc.

Classes: At least Kiosk.java and Printer.java
Kiosk (main)
	user interface - you will welcome customer, offer items for sale
			and publish unit/item prices				
	5 inventory items - should have at least five items for sale
			different prices for each (should vary)
			names or description of items should not be same length
	no more than 9 of each item can be sold
	no item price greater than 99.99
	when they are ready to check out...
	'send' to printer
	for this implementation - do not worry about how to pay, 
			or need to make change

Printer (2nd class)
40char output width is the limitation of printer
Printer uses monospace/courier font 
	- where each letter/space/character all same width
	- if handwritten, you may use underscore ( _ ) to show spacing
Tab 4 spaces 
Header (May include store name, etc)
Qty	Description/Name		Price
1	cup of soup		$ 5.99
2	briskets			$13.99

		    Subtotal     $19.98
		    Tax 7%       $ 1.77
		    Total	$xx.xx
![image](https://user-images.githubusercontent.com/12175344/138114082-6c3dfb97-c1f7-4819-a2d7-cdd7a76f10b8.png)
