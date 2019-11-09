import java.util.Scanner;

public class HomeWorkLMS {

    public static void main(String[] main) {

        Scanner cb = new Scanner(System.in);

        System.out.println("enter a number : ");
        int num1 = cb.nextInt();
          isOdd(num1);







    } public static boolean isOdd(int num1){


        if(num1 %2 ==0){
            System.out.println(num1 + " is an even number ");
            return true;
        }else {
            System.out.println(num1 + " is an odd number ");
            return true;

        }
    }
}























