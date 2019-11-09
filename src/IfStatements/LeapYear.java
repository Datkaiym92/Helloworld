package IfStatements;

import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {
        //the year is leap if it's divisible by 4 and not divisible by 100;
        //the year is leap if it's divisible by 4 and divisible by 100 and divisible by 400
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year...");
        year = sc.nextInt();
        if(year % 4 == 0) {
            if (year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Year is leap line 16");
                }
                else {
                    System.out.println("year is not leap line 19");//not divisible by 400
                }
            }
            else {
                System.out.println("Year is leap line 23");
            }
        }
        else {
            System.out.println("year is not leap line 27");
        }
    }




























}
