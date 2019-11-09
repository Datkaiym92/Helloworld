package arithmeticOperations;

import java.util.Scanner;

public class AverageStudents {

    public static void main(String [] args){

        Scanner inputHt = new Scanner (System.in);
        System.out.println(" Find the average height of students ");

        double height = inputHt.nextDouble();
        double height1 = inputHt.nextDouble();
        double height2 = inputHt.nextDouble();
        double height3 = inputHt.nextDouble();
        double height4 = inputHt.nextDouble();
        double height5 = inputHt.nextDouble();
        double height6 = inputHt.nextDouble();
        double height7 = inputHt.nextDouble();
        double height8 = inputHt.nextDouble();
        double  sumOfStudent=0;
        System.out.println();

        sumOfStudent =height+height1+height2 +height3 + height4 +height5 +height6 +height7 +height8;
        double average =(sumOfStudent/9);
        System.out.println(" Average is " + average);
    }
}
