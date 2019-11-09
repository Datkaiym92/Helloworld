import java.util.Scanner;


public class Calculator {

public static void main(String [] args){

    System.out.println(" Please enter your number: ");
    Scanner input =new Scanner (System.in);

    int number1 =input.nextInt();
    System.out.println(" please enter your number2");
    int number2 =input.nextInt();

    int sum = number1 + number2;

    System.out.println(" Your total number is : " + sum);



}

}
