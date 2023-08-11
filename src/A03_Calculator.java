// 3. Accept two numbers as input and print their sum,subtraction,multiplication,division,modulo.

import java.util.Scanner;

public class A03_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number :");
        double num1 = sc.nextInt();

        System.out.print("Enter second number :");
        double num2 = sc.nextInt();
        sc.close();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        double modulo = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + mul);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + modulo);
    }
} 