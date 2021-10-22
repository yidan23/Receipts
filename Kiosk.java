//TOOK AROUND 10 minutes to type all of this (altogether with Printer.java)
import java.util.Scanner;
public class Kiosk{
  //main method and user interface
  int[] purchased = new int[4];
  int counter = 0;
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Dan's Beverage store!");
    System.out.println("Here is what you can buy:");
    System.out.println("\tApplejuice($2)");
    System.out.println("\tSprite($3)");
    System.out.println("\tCaprisun($1)");
    System.out.println("\tGatorade($2)");
    System.out.println("\tWater($1)");
    Ask();
    Printer print = new Printer(purchased, counter);
  }
//asks user for purchases
  public static void Ask(){
    Scanner scan = new Scanner(System.in);
    System.out.println("How much Applejuice do you wanna buy?: ");
    purchased[0] = scan.nextInt();
    counter+=purchased[0];

    System.out.println("How much Sprite do you wanna buy?: ");
    purchased[1] = scan.nextInt();
    counter+=purchased[1];

    System.out.println("How much Caprisun do you wanna buy?: ");
    purchased[2] = scan.nextInt();
    counter+=purchased[2];

    System.out.println("How much Gatorade do you wanna buy?: ");
    purchased[3] = scan.nextInt();
    counter+=purchased[3];

    System.out.println("How much Water do you wanna buy?: ");
    purchased[4] = scan.nextInt();
    counter+=purchased[4];

    if(counter>9){
        counter = 0;
        Ask();
    }

  }
}
