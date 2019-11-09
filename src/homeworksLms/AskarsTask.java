package homeworksLms;

import java.util.Scanner;

public class AskarsTask {

    public static void main( String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your text please ");
        String  one = sc.nextLine();
        System.out.println("Enter your second text please  ");
        String two = sc.nextLine();


    }
    public static boolean checkVersion( String one , String two){

        if (one.contains(two)){
            return true;
        } else {
            one = one.substring(one.indexOf("version "));
            System.out.println("current version of the app is " + one + " is not " + two);
            return false ;
        }




    }


}
