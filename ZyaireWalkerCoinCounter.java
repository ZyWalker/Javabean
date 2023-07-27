
import java.util.Scanner;

public class ZyaireWalkerCoinCounter {
    public static void main(String[] args){
        
        Scanner myCoins = new Scanner(System.in);

        System.out.println("*******Welcome to Year Up Change Counter******\n");
        System.out.println("Enter Amount of Pennies: ");
        String pennies = myCoins.nextLine();
        System.out.println("Enter Amount of Nickles: ");
        String nickles = myCoins.nextLine();
        System.out.println("Enter Amount of Dimes: ");
        String dimes = myCoins.nextLine();
        System.out.println("Enter Amount of Quarters: ");
        String quarters = myCoins.nextLine();
        myCoins.close();

        int totalAmount = (Integer.parseInt(pennies) + (Integer.parseInt(nickles)*5) + (Integer.parseInt(dimes)*10) + (Integer.parseInt(quarters)*25));
        double roundedTotal = Math.floor((totalAmount/100));
        int cents = totalAmount%100;
       
        System.out.println("\n*******Thank You!******\n");
        System.out.println("You will be receiving " + roundedTotal + " dollars and " + cents +" cents!");      
    }
}
