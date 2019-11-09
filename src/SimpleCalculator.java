import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter two numbers : ");
        // nextDouble() reads the next double

        double first =input.nextDouble();
        double second = input.nextDouble();
        System.out.println(" Enter the operator : ");

        // declare new variable - char

        char operator = input.next().charAt(0);

        double result ;
        switch (operator){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first -second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':

                result = first/second;
                break;
            case '%':
                result = first%second;
                break;
                //
            default:
                System.out.println(" Error !  The operator is not correct ");
                return;}
                System.out.println(" The result is : " + result);

        }
    }

