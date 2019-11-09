package IfStatements;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String [] args ){

        Scanner input =new Scanner(System.in);
        int number = input.nextInt();

        if (number >0) {
            System.out.println(" number is positive ");}
        else if ( number == 0){ System.out.println(" number is zero ");}

        else  { System.out.println(" number is negative ");}


        if (number % 2 == 0){ System.out.println(" your number is even ");}

        else {System.out.println(" Your numbe is odd ");}
    }
}
