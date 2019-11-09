package arithmeticOperations;

import java.util.Scanner;

public class AverageStudent {

    public static void main(String[] args) {
        Scanner inputHeight =  new Scanner(System.in);
        System.out.println("Find out average height of student");
        double height = inputHeight.nextDouble();
        double height1 = inputHeight.nextDouble();
        double height2 = inputHeight.nextDouble();
        double height3 = inputHeight.nextDouble();
        double height4 = inputHeight.nextDouble();
        double height5 = inputHeight.nextDouble();
        double height6 = inputHeight.nextDouble();
        double height7 = inputHeight.nextDouble();
        double height8 = inputHeight.nextDouble();
        double height9 = inputHeight.nextDouble();
        double height10 = inputHeight.nextDouble();
        double height11 = inputHeight.nextDouble();
        double height12 = inputHeight.nextDouble();
        double height13 = inputHeight.nextDouble();
        double height14 = inputHeight.nextDouble();
        double height15 = inputHeight.nextDouble();
        double sumOfHieght=0;
        sumOfHieght =height + height1 + height2 + height3 + height4 + height5 +
                height6 + height7 + height8 + height9 + height10 + height11 + height12+
                height13 + height14 + height15;
        double average = sumOfHieght / 15;
        System.out.println( "The average of student height  " + average);
    }





}
