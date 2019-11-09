package IfStatements;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String [] args){
        Scanner age =new Scanner(System.in);

        System.out.println(" Whats your GPA level ? ");

        double  sc = age.nextDouble();

        if (sc >= 3.5){ System.out.println(" You can get a good payed job  ");}
        else { System.out.println(" You need to get " + (sc-3.5) + "  more point to get job  ");}




    }
}
