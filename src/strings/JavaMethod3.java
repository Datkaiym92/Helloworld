package strings;

import java.util.Scanner;

public class JavaMethod3 {
 public static void main ( String [] args ){

     String str = " Hello World ";
     String strObject = new String(" Hello World ");


     System.out.println( str.length());
    // String strNull = null; null its nothing will give u exception

     String a = " java";
     String b = "JAVA";
     String c= " Python";

     //System.out.println(a=b=c);
     //System.out.println(a);// assighnment starts right to left

     boolean containsBoolean = a.contains("java");
     System.out.println(containsBoolean);
     Scanner in = new Scanner(System.in);
     System.out.println(" Please Enter you Last Name ");
     String lastName =in.nextLine();

     if (lastName.contains(("ova"))){
         System.out.println("You are female");
     }else {
         System.out.println(" you are not female ");
     }


     String str1 =" DevX";
     String str2 = str1.concat(" School");// concantinating str1 to str2
     System.out.println(str2);
     System.out.println(str2.concat("SDET"));
     str2.concat("Fall 2019");
     System.out.println(str2);

     String samsung = "Samsung digital World ";
     int index = samsung.indexOf("S");
     System.out.println(index);


     int indexOfSum = samsung.indexOf("sam",9);
     System.out.println(indexOfSum);



 }


}
