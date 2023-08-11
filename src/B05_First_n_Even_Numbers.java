// 5. Print the first N even numbers.

import java.util.Scanner;

public class B05_First_n_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        int num = sc.nextInt();
        sc.close();

        for (int i = 2; i <= num; i += 2) {
            System.out.println(i);
        }
    }
}
