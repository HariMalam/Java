// 9. Print the Fibonacci series up to N terms.

import java.util.Scanner;

public class B09_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        sc.close();

        int a = 0;
        int b = 1;
        int c;

        System.out.println("The Fibonacci series up to " + n + " terms is:");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}