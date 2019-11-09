import java.util.Scanner;

public class Homeworkmy {

    public static void main(String[] args){

        Scanner inputName =new Scanner (System.in);

        System.out.println(" Please enter your name : ");

        String myName = inputName.next();

        System.out.println("My name is " + myName);

        System.out.println(" Please enter your age : ");


       String age = inputName.next();
       System.out.println(" My age is : " +age );

       System.out.println(" Please enter your city : ");

       String city =inputName.next();

       System.out.println(" I am from " + city);

       System.out.println(" Please enter your phone  number : ");


       String phone =inputName.next();

       System.out.println(" My phone number is : " + phone);

    }


}
