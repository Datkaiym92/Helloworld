package homeworksLms;

import java.util.Scanner;

public class reverseString {
    public static void main(String [] args){

        String original,reverse = "";

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter string word to reverse it ");

        original = sc.nextLine();

        int len = original.length();

        for (int i =len-1; i>=0;i--)
        reverse = reverse+original.charAt(i);
        System.out.println(reverse);

    }
}
