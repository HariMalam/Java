// 11. Calculate the factorial of a given number.

import java.util.Scanner;

public class B11_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        int num = sc.nextInt();
        sc.close();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}
