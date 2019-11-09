package arithmeticOperations;

public class IncrementDecrementOperators {

    public static void main(String [] args){


        int num1 = 100;
        int num2 = 200;

        num1++;// num1 = num1+1;
        num2--;// num2 = num2-1;

        System.out.println(" Number one is :" + num1++);
        System.out.println(" Number two is " + num2--);

        num1--;
        num2++;
         System.out.println(" number one is now " + num1);
         System.out.println(" number two is now " + num2);

         int num1_1 =num1;

         System.out.println(" number one pre increment : " + ++num1);
         System.out.println(" number one post increment " + num1_1++);


         int y =100;
         int x = 500;

         System.out.println(" Y pre increment : " + ++y);// pre increment y =101
         System.out.println(" Y value : " + y );// y= 101

         System.out.println(" X post increment : " + ++x); // x= 501
         System.out.println(" X value : " + x++ );// x= 501
        System.out.println(" X value one more time " +x );// x= 502 because previous line post incremented x
        System.out.println(" X value 3rd time :" + ++x); // x=503
        System.out.println(" X value " + x++); // x=503
        System.out.println(" X value line 37 : " + +x); //x=504 because previous line post incremented x



        int i =10;
        int z =18;

        int result =i++; // the value of post increment (i++) doesnt change on the same statement . However it gets a new
        // value in the next statement its (i++).

        System.out.println(" Result value is : " + result);// result is 10 because 10++ still returns 10 on the same line

        System.out.println(" I value is : " + i);// new value used here i = 11

        System.out.println(" i post increment :" + i++);// i= 11
        System.out.println(" i : " + +i); // i = 12
        System.out.println(" i : " + i ); // i= 12

        System.out.println(" i value line 55 : " + i++);// i =12
        System.out.println(" i value line 56 ;" +i); // i= 13

        // 10++;
        // can only be used with variables . if used with constant values we will get a compile error
        // 2--;
        // ++3 ;

        int pre =8;
        int preResult = ++pre;

        System.out.println(" the result of pre is : " + pre); // 9
        System.out.println(" the result of preResult os " + preResult); //9







    }
}
