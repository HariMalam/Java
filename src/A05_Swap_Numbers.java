// 5. Accept two numbers as input and swap their values.

import java.util.Scanner;

public class A05_Swap_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number :");
        int num1 = sc.nextInt();

        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        sc.close();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
    }
}
