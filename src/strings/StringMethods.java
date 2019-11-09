package strings;

public class StringMethods {

    public static void main( String [] args){

        String str = "Hello- world!!!";
        String devX = " DevX School";
        int sizeOfMyString=str.length();

        System.out.println(sizeOfMyString);// 14 ;will calculate length of String

        String str2 = "1245";
        int sizeOfMyString2 = str.length();
        System.out.println(sizeOfMyString); // 6;

        System.out.println(str.length());

         char wOfHelloW = str.charAt(8);
         System.out.println(wOfHelloW); // W ;

        char hyphen = str.charAt(5);
        System.out.println(hyphen);// -;

        char exclamation = str.charAt(12);
        System.out.println(exclamation);// !

       String world = str.substring(7);
       System.out.println(world); // World!

        String school = devX.substring(5);
        System.out.println(school);

        String ello = str.substring(1,5);
        System.out.println(ello);
        String or = str.substring(8,10);
        System.out.println(or);

        String xs =devX.substring(3,6);
        System.out.println(xs);



    }
}
