package switchstatement;

import java.util.Scanner;

public class YearSeasons {


    // find a month (February) by getting a sequence number of a month(2)
    // find which season is that month belongs to

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your month");

        int monthN = sc.nextInt();
        String month;
        String season;

        switch (monthN) {
            case 1:
                month= " January ";
                season="winter";
                break;
            case 2:
                month=" February ";
                season= "winter";
                break;
            case 3:
                month=" March ";
                season="Spring ";
                break;
            case 4:
                month=" April";
                season="Spring ";
                break;
            case 5:
                month=" May";
                season="Spring ";
                break;
            case 6:
                month=" June ";
                season="Summer ";
                break;
            case 7:
                month =" July ";
                season="Summer  ";
                break;
            case 8:
                month=" August ";
                season="Summer  ";
                break;
            case 9:
            month=" september";
                season="Fall ";
                break;
            case 10:
               month= " october ";
                season="Fall ";
                break;
            case 11:
                month=" november ";
                season="Fall ";
                break;
            case 12:
                month=" December";
                season="Fall ";
                break;
            default:
                month=" Invalid number";
                season="invalid number ";
                break;


        }
                System.out.println(month);
                System.out.println(season + " from first switch statement");

        switch (month)  {
            case "January":
            case "February":
            case "December":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid Month");
        }





















    }
}
