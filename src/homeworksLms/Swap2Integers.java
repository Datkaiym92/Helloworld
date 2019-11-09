package homeworksLms;

import java.util.Scanner;

public class Swap2Integers {

    public static void main( String []args ){

        int num;

        Scanner cb = new Scanner(System.in);

        System.out.println("enter two number : ");
        int num1 = cb.nextInt();
        int num2 = cb.nextInt();

        num=num1;
       num1= num2;
       num2=num;

        System.out.println("After the swap , first integer is " + num1 + " second integer is " +num2) ;
    }
}
