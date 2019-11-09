package whileloops;

import java.util.Scanner;

public class AverageTest {

    public static void main(String [] args ){

        boolean isPath = true;
        while (isPath){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score for 1st test ");
        int score1 = sc.nextInt();
        System.out.println("Enter your score for 2nd test ");
        int score2 = sc.nextInt();
        System.out.println("Enter your score for 3rd test ");
        int score3 = sc.nextInt();

        int average = (score1+score2+score3)/3;

            if (average<60){
                System.out.println(" you have to take the exam again ");
            }else {
                System.out.println(" You have passed the  class ");
                isPath=false;
            }
        }


    }
}
