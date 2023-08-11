// 8. Check if a given character is a vowel or consonant.

import java.util.Scanner;

public class B08_Vowel_Consonant_Checker {
    private static final String vowel = "aeiou";

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return vowel.indexOf(ch) >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character :");
        char ch = sc.next().charAt(0);
        sc.close();
        if(isVowel(ch)){
            System.out.println(ch + " is vowel");
        }
        else {
            System.out.println(ch + " is consonant");
        }
    }
}