import java.util.Scanner;

public class LogicalOperatorsExample {

    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("is it rainy now ? ");
        boolean isRainy = sc.nextBoolean();
        System.out.println(isRainy);

        System.out.println(" Is it Sunny now? ");
        boolean isSunny = sc.nextBoolean();

        boolean isRainbow = isRainy && isSunny; // && conditional AND
        System.out.println( " Is there a rainbow outside now? " + isRainbow);



        System.out.println(" Does the wall have background paint ?");
        boolean isBackgroundColor =sc.nextBoolean();

        System.out.println(" does the wall have picture?");
        boolean isPictured = sc.nextBoolean();


        boolean isWallGood = isBackgroundColor || isPictured; // conditional OR
        System.out.println(" Is manager happy ?"+ isWallGood);





    }
}
