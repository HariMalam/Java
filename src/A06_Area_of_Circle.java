// 6. Accept the radius of a circle as input and calculate its area

import java.util.Scanner;

public class A06_Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of a Circle :");
        double radius = sc.nextDouble();
        sc.close();

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + area);
    }
}
