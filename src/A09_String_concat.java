// 9. Accept two strings as input and concatenate them.

import java.util.Scanner;

public class A09_String_concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String :");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String :");
        String str2 = sc.nextLine();

        sc.close();

        String concated_String = str1 + str2;

        System.out.println("Concated String :" + concated_String);
    }
}
