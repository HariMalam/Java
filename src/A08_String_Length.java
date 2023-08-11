// 8. Accept a string as input and print its length.

import java.util.Scanner;

public class A08_String_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String :");
        String str = sc.nextLine();
        sc.close();

        int string_length = str.length();

        System.out.println("The length of given string is " + string_length);
    }
}
