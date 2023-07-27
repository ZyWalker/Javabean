import java.util.Scanner;

public class Grading {
        public static void main(String[] args){
         Scanner myName = new Scanner(System.in);
         Scanner myInt = new Scanner(System.in);
         Scanner myGrade = new Scanner(System.in);
         System.out.println("***************");
         System.out.println("*             *");
         System.out.println("*   Welcome!  *");
         System.out.println("*             *");
         System.out.println("***************");
         System.out.println("\n\n\n******* Step 1: Create Username *******");
         System.out.println("Enter Name: ");
         String yourName = myName.nextLine();
         String yourNameLower = yourName.toLowerCase();
         String userName = yourNameLower.substring(0, 3) + "_YearUp";
        System.out.println("Thank you! " + yourName + " is now " + userName);
        System.out.println("\n\n\n******* Step 2: Odd or Even *******");
        int yourNum;
        do{
        System.out.println("Enter integer between 1-100: ");
         yourNum = myName.nextInt();
        }while(0>yourNum || yourNum >100);
        if (yourNum%2 == 0 && 0 < yourNum && yourNum <= 100 ){
            System.out.println(yourNum + " is an even number");}
        if (yourNum%2 != 0 && 0 < yourNum && yourNum <= 100 ) {
            System.out.println(yourNum + " is an odd number");
        }
        
        
        System.out.println("\n\n\n******* Step 3: Numeric Grade to Letter Grade *******");
        System.out.println("Enter Numerical Grade: ");
        float yourGrade;
        do
        {   System.out.println("Enter number between 1 and 100");
             yourGrade = myGrade.nextFloat();
        }while(0>yourGrade || yourGrade >100);
        if (0.0 <= yourGrade && yourGrade <= 59.9){
            System.out.println(yourGrade + " equates to an F :( do better");}
        else if (60.0 <= yourGrade && yourGrade <= 69.9){
            System.out.println(yourGrade + " equates to a D");}
        else if (70.0 <= yourGrade && yourGrade <= 79.9){
            System.out.println(yourGrade + " equates to a C");}
        else if (80.0 <= yourGrade && yourGrade <= 89.9){
            System.out.println(yourGrade + " equates to a B");}
        else if (90.0 <= yourGrade && yourGrade <= 100.0){
            System.out.println(yourGrade + " equates to a A!!!");}
            
        
        }

}
