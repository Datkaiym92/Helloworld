package strings;

public class StringMethods3 {

    public static void main(String [] args){
        // how to find the first o in DevX School

        int indexOfO = "DevX School".indexOf("o");
        System.out.println(" Dev School ".charAt(indexOfO));

        System.out.println( "Dev School".substring("Dev School ".indexOf("S")));

        String str = "American Dream Dream Big ";
        System.out.println(str.substring(15));

    }
}
