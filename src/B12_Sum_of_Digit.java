// 12. Calculate the sum of digits of a given number

import java.util.Scanner;

public class B12_Sum_of_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println(sum);
    }
}