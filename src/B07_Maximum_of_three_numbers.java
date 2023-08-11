// 7. Find the maximum of three given numbers.

import java.util.Scanner;

public class B07_Maximum_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number :");
        int num2 = sc.nextInt();
        System.out.print("Enter Third Number :");
        int num3 = sc.nextInt();
        sc.close();

        int maximum = num1;

        if (num2 > maximum) {
            maximum = num2;
        }

        if (num3 > maximum) {
            maximum = num3;
        }

        System.out.println("Maximum Number is " + maximum);
    }
}