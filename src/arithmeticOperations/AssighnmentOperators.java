package arithmeticOperations;

public class AssighnmentOperators {
    public static void main(String [] args){
        // declaring
        int num1 =100;
        int num2 =50;
        System.out.println("num1 =>>>" +num1);

        num1=num2;
        num1 =num2;
        num2 =num1;
        System.out.println(" num1 =>>>" +num1);
        System.out.println(" num2 =>>>" +num2);

        int x = 15;
        int y = 5;
        int z =10;
        System.out.println("Value of X: " + x );

        x+=5; // adding x = x+5;// 20
         System.out.println("value of x after addition : " + x);

         y*=4; // y = y*4;

        System.out.println(" value pf y after multiplication :" + y);

        x/=2; // x=x/2
        System.out.println(" the value of X after division :" + x);
        x%= z; // x = x % z; x is 10, z is 10;
        System.out.println(" Value of X after modulo : " +x);

        x+=y*z; // x = x + y * z;

        System.out.println(" value of X :" +x);

        int firstNum = 5;
        int secondNum =2 *(firstNum=20);
        int thirdNum = firstNum += 2*1+1+44%2;


        System.out.println("the value of first num :" + firstNum);
        System.out.println(" the value of second Num : " + secondNum );
        System.out.println(" third Num is : " +thirdNum);








    }
}
