package IfStatements;

import java.util.Scanner;

public class StudentGrade {

    public static void main( String [] args){

        Scanner gr = new Scanner(System.in);

        System.out.println(" Please enter your score of Quiz   ?  ");
        int qz = gr.nextInt();
        if (qz <0 || qz >100)
        { System.err.println( " Your quiz is invalid . Please enter number from 0- 100 ");
        System.exit(0);}
        System.out.println(" Please enter your mid-term score ");
        int mt = gr.nextInt();
        System.out.println(" Please enter your Final score ");
        int fs = gr.nextInt();
        int average =((qz+mt+fs)/3);

        if (average >=90 && average<=100){ System.out.println(" Your grade is 'A' ");}

        else if (average >=70 && average <90) { System.out.println(" your grade  is 'B' ");}
       else if ( average <= 50 && average<70){ System.out.println(" Your grade is 'C' ");}
       else if ( average <50 && average>0 ){ System.out.println(" your grade is 'F' ");}
       else {System.out.println(" Average score must be in range of 0 --> 100... Please try again ! ");}


    }
}
