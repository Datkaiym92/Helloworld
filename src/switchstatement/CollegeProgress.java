package switchstatement;

import java.util.Scanner;

public class CollegeProgress {

    public static void main(String [] args ){
        // Basic Algebra----CS---Economics
        // Advanced Algebra --CS--Economics
        // Trigonometry--CS
        // Statistics ---Economics
        // Calculus---CS
        // calculus 2--CS

        Scanner sc = new Scanner(System.in);
        System.out.println(" which year in college ? ");
        int year =sc.nextInt();

        System.out.println(" What is your major ? ");
        String major = sc.next();
        String course ;

        switch (major){
            case "CS":
                switch(year){
                    case 1:
                        course="Basic Algebra";
                        break;
                    case 2:
                        course="Advanced Algebra";
                        break;
                    case 3:
                        course="Trigonometry";
                        break;
                    case 4:
                        course=" Calc";
                        break;
                    case 5:
                        course="Calc2";
                        break;
                    default:
                        course = " you are either graduated or haven't started ";
                        break;

                }break;

            case "Economics":
                switch (year) {
                    case 1:
                        course = "Basic Algebra ";
                        break;
                    case 2:
                        course= "Advanced Algebra ";
                        break;
                    case 3:
                        course="Statistics";
                        break;
                    case 4:
                    case 5:
                        course="Your math courses are completed";
                        break;
                    default:
                        course= " your are either graduated or haven't started ";
                        break;


                }
                break;
            default:
                course= " we dont offer " + major+ " in Devx School";
        }
        System.out.println(" in year number " + year + " for major " + major);
        System.out.println(" course info " + course);





        }

    }

