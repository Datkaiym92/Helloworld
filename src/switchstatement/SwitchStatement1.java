package switchstatement;

import java.util.Scanner;

public class SwitchStatement1 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println(" Whats your gender ? ");

        char gender =sc.nextLine().charAt(0);

        switch (gender){
            case 'F':
                System.out.println(" Its a girl ");
                break;
            default:
                System.out.println(" Invalid entry");
                break;
            case 'M':
                System.out.println(" Its a boy ");
                break;
            case 'G':
                System.out.println(" not sure ");
                break;


        }

    }
}
