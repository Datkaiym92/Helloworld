package IfStatements;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        System.out.println(" Please enter your age : ");
        int age = nm.nextInt();
        if (age >= 18) {
            System.out.println(" You are allowed to vote ");
        }
        if (age < 18) {
            System.out.println(" You are not allowed to vote ");
        }

        System.out.println(" What time is it now ? ");

        int time = nm.nextInt();


         if (time  >= 0 && time <= 11) {
            System.out.println(" Good morning Sunshine ! ");

            time++;
             System.out.println(" The next hour will be " + time); }
             else {System.out.println(" Its not morning anymore .You slept the morning away !!!");}


    }





    }

