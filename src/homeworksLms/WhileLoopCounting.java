package homeworksLms;

import java.util.Scanner;

public class WhileLoopCounting {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the message and I will display it 5 times ");
        String message = sc.nextLine();
        boolean isMessage = true;
        int count=0;
        while (isMessage){
            System.out.println(message);
            count++;
            if (count>=5){
                isMessage=false;
            }

        }
    }
}
