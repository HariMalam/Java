// 7. Accept a temperature in Celsius and convert it to Fahrenheit.

import java.util.Scanner;

public class A07_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Celsius :");
        double celsius = sc.nextDouble();
        sc.close();

        double fahrenheit = (celsius * 9) / 5 + 32;

        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
    }
}
