// 6. Print the sum of all numbers from 1 to N.

import java.util.Scanner;

public class B06_Sum_of_First_n_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of 1 to " + num + " numbers is " + sum);
    }
}

