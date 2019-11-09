public class Datatyperecap {

    public static void main(String args[]){

        byte chicagoSpeedLimit = 120;
        byte newYorkSpeedLimit =80;
        byte laSpeedlimit =chicagoSpeedLimit;

          System.out.println("Chicago Speed limit is " + chicagoSpeedLimit);
          System.out.println(" New York Speed Limit " + newYorkSpeedLimit);
          System.out.println(" LA Speed Limit is "+ laSpeedlimit);

          int youTubeViews = 15000 , nambaViews = 1000000;

          System.out.println(" YouTube views:" + youTubeViews);

          float whiteRainRating = 10.0f, subtleArtRating = 7.9f, elonMask = 9.9f;
          System.out.println("White Rain Composition Rating:" + whiteRainRating);
          System.out.println(" Subtele Art of not giving a ffff" + subtleArtRating);
          System.out.println(" Elon Musk Bioghraphy " + elonMask);

          long chinaPopulation = 150000000000l;
          int chinaPopulationInt=150000000;
          int indiaPopulation =  chinaPopulationInt;

          byte devXStudentsCount = 25;
          short jobOpeningsForSoftwareEngineers = 500;
          int devXStudentCountInt =jobOpeningsForSoftwareEngineers;

          // smaller dataType cannot hold larger ones despite the values are in valid range.
         // byte jobOpeningsByte = jobOpeningsForSoftwareEngineers;


        float largestDecimelPointForFloat = 0.9999999999f;
        System.out.println(largestDecimelPointForFloat);

        float nextDecimalPointCheck = 15.111111111111f;//15.1111111
        float nextDecimalPointCheck2 = 15.111111711111f;//15.1111117
        float rounddecimalpointcheck =22.5634567f;

        float ifWholeNumberIsMoreThanInt = 2223445565.12f;

        System.out.println(rounddecimalpointcheck);
        System.out.println(nextDecimalPointCheck);
       System.out.println(nextDecimalPointCheck2);
       System.out.println(ifWholeNumberIsMoreThanInt);

       double largestDecimalPointForDouble   = 0.99999999999999999999;
       double nextDecimalPointCheckDouble = 15.11111111111111111111;
       double nextDecimalPointCheckDouble2 = 15.1111116111111111111;
       float nextDecimalPointCheckDouble3 = 5.1111116111111f;


       System.out.println();
       System.out.println(largestDecimalPointForDouble); //1
        System.out.println(nextDecimalPointCheckDouble);
        System.out.println(nextDecimalPointCheckDouble2);
        System.out.println(nextDecimalPointCheckDouble3);


        double doubleHolder = 9.112;
        float floatHolder = 8.84f;
        // int integerHolder = doubleHolder; -> incompatiable types
        // int integerHolder = floatHolder; -> incompatiable types

        int integerHolder =600000;
        double doubleForInteger = integerHolder;

        System.out.println(doubleForInteger); //600000.0


        long longNumberHolder = 5124242l;
        double doubleForLong = longNumberHolder;

        System.out.println(longNumberHolder);

        byte byteHolder =127;
        float floatForByte =byteHolder;

        System.out.println(floatForByte); //127.0

        int integarForFloat = 12;
        float floatForInt  = integarForFloat;
        System.out.println(floatForInt); //12.0

        char charsHolder = 'A'; // Decimel is 65

        System.out.println(charsHolder);

        double doubleForChars = charsHolder;
         System.out.println(doubleForChars);

         String str =" hello world";

         System.out.println(str);
         // double doubleForString = str; String can only be assighned to String


        long phoneNumber = 4124948663l;
         System.out.println(phoneNumber);






    }
}
