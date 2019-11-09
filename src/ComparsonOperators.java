public class ComparsonOperators {

    public static void main( String[] args){

        int num1 = 5;
        int num2 = 10;
        System.out.println(" Is five equal to ten? " +(5==10));
        System.out.println(" Is five equal to to five ?  " + ( 5 ==5 ));


        System.out.println(" Is 5.5 equal to 10.6 ? " + (5.5 ==10.6));
        System.out.println(" is 5.5 equal to 5 ? " +( 5.5 ==5));

       // System.out.println(" Is true equals to 5 ? " + ( true == 5)); does not compile bc two unmatched types

        System.out.println(" Is true equals to false ? " + ( true == false));

        System.out.println("Is char A equal to 65 ?? " + ('A' ==65)); // uses asci code table

       // System.out.println(" Is String Hello World equal to  to char A ? " + (" hello world " == 'A')); doesnot compile unmatched types


        // !== not equal


        System.out.println(" Is 5 not equal to 10 " +(5 !=10));

        System.out.println(" Is 5 not equal to 5 " +(5 !=5));




        // < less than

        System.out.println(" is 10 less than 5 ?" + (10 <5 ));

        System.out.println(" is 99.9 less than 99 ?" + (99.9 <99));

        System.out.println(" is A less than 67 ?" +('A'< 67));

        System.out.println(" is 55 less than 55 " + (55<55)); // false bc equal

        //> greater then

        System.out.println();

        System.out.println(" is 10 greater  than 5 ?" + (10 >5 ));

        System.out.println(" is 99.9 greater  than 99 ?" + (99.9 >99));

        System.out.println(" is A greater  than 67 ?" +('A'> 67));

        System.out.println(" is 55 greater  than 55 " + (55>55));



        // <= less than  or equal

        System.out.println();


        System.out.println(" is 10 less than or equal to 5 ?" + (10 <=5 ));

        System.out.println(" is 99.9 less than or equal to 99 ?" + (99.9 <=99));

        System.out.println(" is A less than or equal to 67 ?" +('A'<= 67));
        System.out.println(" is 55 less than or equal to  55 " + (55<=55));


        // >=






















    }
}
