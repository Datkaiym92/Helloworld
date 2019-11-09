package mentoring;

import java.util.Scanner;

public class Person {

    public static void main( String [] args ){

//create the program that will ask user to enter month of birth and year of birth
//then create the separate method to count age (Hint: takes year of birth as a parameter, and return int age)
//then create the separate method to check the season when he was born(Hint: takes month of birth as a parameter,
// and return String Season)
//then in main method grate the logic that will check if user is teenager or adult or kid and print
//this person is (teenager/kid/adult) and age is (how old he is) he was born in (Summer/Winter/Spring/Fall)

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter your birth month :  ");
        int month = sc.nextInt();

        System.out.println(" Please Enter your year of your birthday :  ");
        int year = sc.nextInt();

        int age = age(year);
        String season =season(month);
        System.out.println("Testing " +season+ " " + age);

        if (age >=0 && age <13){
            System.out.println("This person is kid " + "and age is " + age + " he/she was born in " + season);
        }else if ( age >= 13 && age <20) {
            System.out.println("This person is teenager " + "and age is " + age + " he/she was born in " + season);

        } else {
            System.out.println("This person is adult " + "and age is " + age + " he/she was born in " + season);

        }



    }
    public static int age(int inputYear){

        int age =2019-inputYear;
        if (age <0){
            System.out.println(" invalid year");
            return 0;
        }
        return age;
    }

    public static String season ( int month ){
        String season ="";
        if (month==3 | month==4 || month==5){ // if we have | it will check both sides , if we have || it will check first
                                              // is true it will check second one
            season="Spring ";
            return season;
        }
        else if (month>=6 && month<=8) {
            season = "Summer";
            return season;
        }
            return null;
    }

}
