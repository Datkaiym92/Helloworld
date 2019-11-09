package groupprojects;

import java.util.Scanner;

public class AverageOfStudents {

    public static void main ( String [] args ){

        double num = 0;
        double x =1;


        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the number (n) you want to calculate the average ");
        int n= sc.nextInt();
        while (x <= n){
        System.out.println(" Enter your mark :" + x);
        num += sc.nextDouble();
        x+=1;


        }double avg =(num/n);
        System.out.println(" Average ajd sum is  " + avg);



    }
}
