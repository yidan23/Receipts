//THIS TOOK ABOUT 10 MINUTES TO TYPE ALTOGETHER (KIOSK INCLUDED)
public class Printer{
    int[] items = new int[4];
    //prints out receipt
    double tax = .17;
    int applePrice = 2;
    int spritePrice = 3
    int waterPrice = 1;
    int caprisunPrice = 4;
    int gatoradePrice = 5;
    int total = 0;
    String[] names = ["Applejuice", "Sprite", "Caprisun", "Gatorade", "Water"];

    public Printer(int[] purchased, int counter){
        items = purchased;
        total = counter;
    }

    public void printReceipt(){
        System.out.println("Quantity      Name                        Price");
        for(int i = 0; i<5; i++){
            if(items[i] != 0){
                System.out.println("");
            }
        }
    }
}
