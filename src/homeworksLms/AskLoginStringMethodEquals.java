package homeworksLms;


import java.util.Scanner;

public class AskLoginStringMethodEquals {

    public static void main(String[] args) {

        String user = "Kaparova92";
        String pass = "Kaparovadatkaiym123";


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your username ");
        String userInput = sc.nextLine();

        System.out.println(" Enter your password ");
        String passInput  =sc.nextLine();


        if(userInput.equals(user) && passInput.equals(pass)){
            System.out.println(" you found password ");
        }else System.out.println(" incorrect password ");


    }
}