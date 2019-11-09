package methods;

public class Methods {

     public  static void main(String [] args){

    // int sum = 1+2;
    // System.out.println(" the result is  =" + sum );
    // int sum1 = 2+4;
    // System.out.println(" the result of sum1 is = " +sum1);

         int firstSum =  sumUpTwoNumbers(5,7);
          System.out.println(" the value of first sum " + firstSum);
          int secondNum = sumUpTwoNumbers(10,10000);
          System.out.println(" the value of secondNum :" + secondNum);

          int f=72;
          int  c =(f-32)*5/9;
         System.out.println(" converted result of your F to C is " + c);

         String nameMethod=giveYourName("John Doe");
         System.out.println(nameMethod);

         String name2 = giveYourName(" Donald Trump ");
         System.out.println(name2);

}


    public static int sumUpTwoNumbers(int num, int num1){

        int sum =num+num1;
        // return is a keyword of a method that specifies an end of the function
        // and returns the result which the programmer has specified .
        // whatever comes after the return keyword is what comes out of the method when its called .

        return sum ;
    }
     public static int convertFtoC(int f){

         int celcius =(f-32)*5/9;
         return celcius;
     }

     public static String giveYourName(String name){

         return " Your name is " + name;
     }
}
