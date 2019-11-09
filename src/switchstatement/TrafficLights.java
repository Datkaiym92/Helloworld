package switchstatement;

import java.util.Scanner;

public class TrafficLights {
    public static void main(String [] args ){

        Scanner sc = new Scanner(System.in);


       System.out.println( " Here is the numbers for Traffic light : ");
       System.out.println("\t1. Red  \t2.Yellow   \t3. Green");

      int num=sc.nextInt();

       String colour ;

       switch (num){
           case 1:
              colour=" Red";
              break;
           case 2:
               colour= "Yellow";
               break;
           case 3:
               colour= " Green";
               break;
           default:
               colour=" Error ";
               break;
       }
       System.out.println(colour);


    }
}
