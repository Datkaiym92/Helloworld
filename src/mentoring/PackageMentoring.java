package mentoring;

import java.util.Scanner;

public class PackageMentoring {

    public static void main(String [] args){
        String product = "coke";
        double price = 1.10;
        double change;
        int bill;
        int quarters,dimes,nickels,pennies;

        Scanner in = new Scanner(System.in);

        System.out.println(" Please enter your bill for coke price is  :  " + price + "$");

         bill =in.nextInt();
         change = bill-price;
         int changeCent =(int) (change * 100);

         System.out.println(" your change is: " + changeCent + " cent " );
         quarters =changeCent/25; // 3-how many quarters
        changeCent %=25;// 15
        dimes= changeCent/10; // 1- how many dimes
         System.out.println();
         changeCent%=10;//5
        nickels = changeCent/5;
        pennies = changeCent%5;
        System.out.print(" your change is :");
        System.out.print(quarters + " quarters ");
        System.out.print(dimes + " dimes ");
        System.out.print(nickels + " nickels ");
        System.out.println(pennies + " pennies ");









    }
}
