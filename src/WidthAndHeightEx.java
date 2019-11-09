import java.util.Scanner;

public class WidthAndHeightEx {

    public static void main(String[] args){

        Scanner wh =new Scanner (System.in);

        System.out.println(" Please enter your Width :");

        float w = wh.nextFloat();

        System.out.println(" Please enter your height :");
          float h = wh.nextFloat();
          int p =2;
          System.out.println(" Area is " + w * h);
          System.out.println(" Perimeter is " + p *(w + h));


    }
}
