package whileloops;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String [] args ){

        Scanner sc = new Scanner(System.in);

        String passWord = "c";
        String userName = "DevX School";
        boolean retry = true;
        int retryCount = 0;

        while (retry && retryCount<3){
        System.out.println("Please Enter your user Name");
        String userNameEntered = sc.nextLine();
        System.out.println("Please Enter your password");
        String passEntered = sc.nextLine();
        if(userName.equalsIgnoreCase(userNameEntered) && passEntered.equals(passWord)){
            System.out.println("You are Successfully Logged in");
            retry = false;
        }
        else{
            System.out.println("Invalid Password entered");
            retryCount++;

        }
    }
}
}

