// 3. Check if a given year is a leap year.

import java.util.Scanner;

public class B03_Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year :");
        int year = sc.nextInt();
        sc.close();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (isLeapYear) {
            System.out.println(year + " is Leap Year");
        } else {
            System.out.println(year + " is not Leap Year");
        }
    }
}
