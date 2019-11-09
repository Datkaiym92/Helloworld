package IfStatements;

import java.util.Scanner;

public class IfStatement {

    public static void  main(String [] args) {

        System.out.println(" please enter some number ...");
        Scanner sc = new Scanner(System.in);

        int givenNumber = sc.nextInt();
        // boolean positive = givenNumber >=0;
        //  boolean negative = givenNumber<0;

        //  System.out.println(" your number is positve " + positive);
        //  System.out.println( " your number is negative " + negative);


        if (givenNumber >= 0) {
            System.out.println(" your number is positive ");

        System.out.println(" we are inside the the if statement");}

        if (givenNumber<=0){ System.out.println(" your number is negative ");}


        if (givenNumber >=0 && givenNumber<10){ System.out.println(" your number is between 0 -10 ");}





    }



}

