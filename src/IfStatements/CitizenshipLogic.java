package IfStatements;

import java.util.Scanner;

public class CitizenshipLogic {

    //find out if the user is eligible for citizenship
    //must have a greencard
    //must have lived for 5 years
    //must pass the exam
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you a permanent resident of US? please enter true or false");
        boolean greenCardHolder = sc.nextBoolean();
        if(greenCardHolder){
            System.out.println("How long have you lived in US?");
            int yearsInUs = sc.nextInt();
            if (yearsInUs >= 5) {

                System.out.println("Did you pass the exam? true or false");
                boolean examPassed = sc.nextBoolean();
                if(examPassed){
                    System.out.println("You are eligible to get a CitizenShip");
                }
                else {
                    System.out.println("You failed the exam. Prepare for next time.");
                }
            }
            else {
                System.out.println("You are not eligible for citizenship. you need to be in US " + (5-yearsInUs) +  " more years");
            }
        }  else {
            System.out.println("you are not eligible for Citizenship because of you are not greencard holder");
        }
    }





























}
