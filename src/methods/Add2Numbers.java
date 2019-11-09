package methods;

import java.util.Scanner;

public class Add2Numbers{

    public static void main( String [] args){

        int a = 21;
        int b =3;

         int sum = addNumbers(a,b);
        System.out.println(sum);

        int sum1 =divideNumbers(a,b);
        System.out.println(sum1);

        int sum2 =multiplyNumbers(a,b);
        System.out.println(sum2);

        int sum3 =subtractNumbers(a,b);
        System.out.println(sum3);


    } public static int addNumbers( int a,int b){
        int sum  =a+b;
        return sum;

    } public static int divideNumbers(int a,int b){
        int sum1 = a/b;
        return sum1;
    } public static int multiplyNumbers(int a,int b){
        int sum2 = a*b;
        return sum2;
    }public  static int subtractNumbers(int a,int b){
        int sum3 = a-b;
        return sum3;
    }
}
