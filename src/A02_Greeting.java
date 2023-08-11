// 2. Accept a name as input and print a greeting message

import java.util.Scanner;

public class A02_Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();
        sc.close();

        System.out.println("Hello, " + name + "!");

    }
}
