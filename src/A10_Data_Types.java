// 10. This program introduces use of various data type in the program

public class A10_Data_Types {
    public static void main(String[] args) {
        byte a = 10;
        short b = 10 * 128;
        int c = 1000 * 128;
        long d = 10000 * 1000 * 128;
        double e = 99.9998;
        char f = 'a';
        boolean g = true;
        boolean h = false;

        System.out.println("The value of a = " + a);
        System.out.println("The value of b = " + b);
        System.out.println("The value of c = " + c);
        System.out.println("The value of d = " + d);
        System.out.println("The value of e = " + e);
        System.out.println("The value of f = " + f);
        f++;
        System.out.println("The value of f after increment = " + f);
        System.out.println("The value of g = " + g);
        System.out.println("The value of h = " + h);
    }
}