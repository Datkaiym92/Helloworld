package groupprojects;

import java.util.Scanner;

public class GenderGame {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" What is your first and Last name ? ");
        String firstLastN = sc.nextLine();

        System.out.println(" Whats your gender ? ");
        char gender = sc.next().charAt(0);

        System.out.println(" How old are you ?");
        int age = sc.nextInt();

        if (gender == 'F') {
            if (age >= 20) {
                System.out.println(" Are you married ? ");
                char status = sc.next().charAt(0);

                if (status == 'y') {
                    System.out.println(" Then I shall call you Mrs. " + firstLastN);
                } else
                    System.out.println(" then I shall call Ms." + firstLastN);
            }
            if (age < 20) {
                System.out.println(" Then I shall call you " + firstLastN);
            }
            if (gender == 'M') {
                if (age >=20)
                System.out.println("I shall cal you Mr. " + firstLastN);
            } else {
                System.out.println(" I shall call you " + firstLastN);
            }


        }
    }
}