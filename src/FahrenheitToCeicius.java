import java.util.Scanner;

public class FahrenheitToCeicius {

    public static void main(String[] args){



        // (°C  *9/5) +32 = °F formula

        Scanner cs = new Scanner(System.in);
        System.out.println(" enter your C degree ");
         float C = cs.nextFloat();

         float F = (C*9/5)+ 32;
        System.out.println(" Result in  F is " +F);
























         // gallons to liter  1 gl *3.785

       // System.out.println(" please enter gl amount ");

        double  gl = cs.nextDouble();
        double  lt = gl *3.785;

        //System.out.println( "result in liter  is " + lt);
    }
}
