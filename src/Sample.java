
import java.util.Scanner;

public class Sample {

    public static void main(String args []){

        Scanner inputName =new Scanner (System.in);

        System.out.println("What is your name ?:" );
        String firstName = inputName.next();

        System.out.println(" My first name is: "  + firstName);


        System.out.println(" Whats is your last name ? ");

        String lastName = inputName.next();

       System.out.println("My last name is : "  + lastName);
    }
}
