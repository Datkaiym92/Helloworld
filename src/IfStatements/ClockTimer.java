package IfStatements;

import java.util.Scanner;

public class ClockTimer {
    public static void main(String [] args){
        Scanner tm = new Scanner(System.in);
        System.out.println(" What time is it now ? ");

        int time =tm.nextInt();
        System.out.println(" Is it am or pm ? ");
        char ap =tm.next().charAt(0);// a or p


        if( time > 0 && time<11 && ap =='a' ){ System.out.println(" Good morning !");}

        if ( time >0 && time <=6 && ap == 'p'){ System.out.println(" Good evening ");}
        if ( time >= 6 && time<= 11 && ap == 'p'){System.out.println(" Good night ");}


    }
}
