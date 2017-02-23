//Write a Java program to find the number of days in a month
import java.util.Scanner;

public class test {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int days = 0;
        String MonthName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthName = "January";
                days = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                MonthName = "March";
                days = 31;
                break;
            case 4:
                MonthName = "April";
                days = 30;
                break;
            case 5:
                MonthName = "May";
                days = 31;
                break;
            case 6:
                MonthName = "June";
                days = 30;
                break;
            case 7:
                MonthName = "July";
                days = 31;
                break;
            case 8:
                MonthName = "August";
                days = 31;
                break;
            case 9:
                MonthName = "September";
                days = 30;
                break;
            case 10:
                MonthName = "October";
                days = 31;
                break;
            case 11:
                MonthName = "November";
                days = 30;
                break;
            case 12:
                MonthName = "December";
                days = 31;
        }
        System.out.print(MonthName + " " + year + " has " + days + " days");
    }
}