// 4. Accept a number as input and print its square.

import java.util.Scanner;

public class A04_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int num = sc.nextInt();
        sc.close();

        int square = num * num;

        System.out.println("The Square of " + num + " is " + square);
    }
}
