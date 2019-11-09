import java.util.Scanner;

public class HomeworkCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("How many apples per bag? ");

        int apples = input.nextInt();

        System.out.println("How many bags of apple? ");

        int bag = input.nextInt();

        int total = apples*bag;

        System.out.println("Total apples are: " + total);

    }
        }














