// 1. Accept a number as input and check if it's positive, negative, or zero.

import java.util.Scanner;

public class B01_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        int num = sc.nextInt();
        sc.close();

        if (num > 0) {
            System.out.println("You Entered Positive Number");
        } else if (num < 0) {
            System.out.println("You Entered Negative Number");
        } else {
            System.out.println("You Entered Zero");
        }
    }
}
