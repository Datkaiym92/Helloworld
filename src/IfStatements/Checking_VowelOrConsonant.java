package IfStatements;

import java.util.Scanner;

public class Checking_VowelOrConsonant {

    public static void main(String[] args) {

        Scanner letter = new Scanner(System.in);
        System.out.println(" please your letter ? ");

        char vowels = letter.next().charAt(0);


        if (vowels == 'a' || vowels == 'u' || vowels == 'o' || vowels == 'i') {
            System.out.println(vowels + " its vowel");
        } else {
            System.out.println(" the letter is a consonant");
        }
    }
}
