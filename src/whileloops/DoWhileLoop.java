package whileloops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileLoop {
    //how much u contribute
    // the percentage of the interest
    // we should get the number of years required to doubled the amount
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println(" pls enter contribution amount : ");
        //double contribution = input.nextDouble();
        //System.out.println(" Please enter interest rate ");
        //int interest = input.nextInt();

        //int year = yearRequired(contribution, interest);
        //System.out.println("In " + year + " you will double your $$ " + contribution + " contribution");


        System.out.println(" enter loan amount ");
        double loanAmount = input.nextDouble();
        System.out.println(" minimum monthly payment");
        double minMonPayment = input.nextDouble();
        System.out.println("enter num of no interest month ");
        int noInterestMonth = input.nextInt();
        System.out.println(" enter late fee amount ");
        double lateFee = input.nextDouble();
        System.out.println(" enter interest rate ");
        int interestRate = input.nextInt();

        loanProgram(loanAmount, minMonPayment, noInterestMonth, lateFee, interestRate);

    }


    public static int yearRequired(double contributionAmount, int interestRate) {
        double balance = contributionAmount;
        int year = 0;
        while (balance <= contributionAmount * 2) {
            balance = (balance * interestRate / 100) + balance;
            year++;
        }
        return year;

    }

    // your taking 10,000 (dynamic)loan , minimum payment is 500 monthly
    // late fee ( dynamic)
    // if u pay this in 5 (dynamic) month u do not get get APR interest charge
    // after 10 month every month you will have to pay n% of the balance

    public static void loanProgram(double loanAmount, double minPaymentRequired, int noInterestMonth, double lateFeeAmount, int interestRate) {

        double balance = loanAmount;
        interestRate=interestRate/12;
        int monthNum = 1;

        while (balance >= 0) {

            System.out.println(" your balance amount " +(100*balance)/100);
            System.out.println(" this is your" + monthNum + " payment . How much you want to pay?");
            Scanner in = new Scanner(System.in);
            double payment = in.nextDouble();
            if (payment < minPaymentRequired) {
                if (monthNum <= noInterestMonth) {
                    balance = balance - payment + lateFeeAmount;

                } else {
                    balance = (balance - payment) + balance * interestRate / 100 + lateFeeAmount;
                }
            }
                if (monthNum <= noInterestMonth) {
                    balance = balance - payment;
                } else {
                    balance = (balance - payment) + balance * interestRate / 100 + lateFeeAmount;
                }
            }

                monthNum++;

        System.out.println(" Loan is paid off ");


        }
}
