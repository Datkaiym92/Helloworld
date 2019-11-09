package arithmeticOperations;

public class ArithmeticOperators {

    public static void main(String[] args){

        int num1 =5;
        int num2 =10;
        int sum = num1+num2;

        long longNum1 = 10000l;
        long longNum2 = 5000l;
        long longSum = longNum1 + longNum2;

        double doubleNum1 = 59.99;
        double doubleNum2 = 45.50;
        double doubleSum = doubleNum1+ doubleNum2;
         long sumOfLongAndInt = num1 + longNum1;

        int sumOfLongAndInt2 =(int) (num1 + longNum1);

        System.out.println( "The sum of long and int af ter casting : " + sumOfLongAndInt2);

         System.out.println(" Long and Int sum " + sumOfLongAndInt);




        System.out.println(" Number one : " +num1);
        System.out.println(" Number two : " +num2);
        System.out.println(" Sum of the two numbers is : " + sum);

        System.out.println( "Sum of the two numbers : " + longSum);


        System.out.println(" the sum of two numbers: " + doubleSum);


        byte byteNum1 =24;
        short shortNum =5100;

        // byte sumOfByteAndShort = byteNum1 + shortNum1;
        // short sumOfByteAndShort = byteNum1 + shortNum1;

        int sumOfByteAndShort = byteNum1 + shortNum;

        System.out.println(" sum of byte and short : " + sumOfByteAndShort);

       short sumOfByteAndShort2 = (short) (byteNum1 + shortNum);

       // casting = changing the datatypes

        System.out.println(" sum of the byte and short after casting " +sumOfByteAndShort2 );

        int x =100000;
        short shortNum1 = 32000;
        short sumOfByteAndShort4 = (short) (x + shortNum);
        System.out.println("the sum of Short and Integer : " +sumOfByteAndShort );

        int number1 = 60;
        int number2 =20;

        int difference = number1 - number2;

        System.out.println(" the difference of the two numbers :" + difference );

        difference =number1 -80;
        System.out.println(" the differense of two numbers part 2 : " +difference );


        int multiplyNum1 = 35;
        int multiplyNum2 =13;
        int multiplicationResult = multiplyNum1 * multiplyNum2;

        System.out.println(" Multiplication result : " + multiplicationResult);

        multiplicationResult = (int) 6000000000000l* -10;

        System.out.println(" multiplication result part 2 ; : " +multiplicationResult);


        int divisionNumber =65;
        int divisionNumber1 = 5;
        int divisionResult = divisionNumber / divisionNumber1;
        System.out.println(" Division result :" + divisionResult);
        divisionResult =9/2;
        System.out.println(" Division result with decimal points: " +divisionResult);


        double divisionResult2 =9/2.0;
        System.out.println(" Division result with decimal points stored in a double : " + divisionResult2);
        int divisionResult3 = (int)(9/2.0);
        System.out.println(" Division result with decimal points stored in a double : " + divisionResult3);


        int round =17/6;

        System.out.println(" the round result : " + round );

        float floatNum = 1.11233458f;

        System.out.println(floatNum);

        double doubleNum =6.8;
         int intNumber = (int) 6.8;

         System.out.println("double number : " +doubleNum ); // 6.8
         System.out.println(" int number : " + intNumber ); // 6

        //int divideByZeroResult = 102/0; -> causes Arithmetic Exception

       //System.out.println(" Divide by zero result " +divideByZeroResult);// java cant divide by zero


        int moduloResult = 9 %3 ;
        System.out.println( " Modulo of 9 and 3 is : " +moduloResult);

        moduloResult = 10% 3;
        System.out.println(" modulo of 10 of 3 is : "  + moduloResult);

      double  moduloResult2 = 12.5 %5.5;
        System.out.println(" modulo of 12.5 of 5.5 is : "  + moduloResult2 );







    }
}
