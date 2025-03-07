import java.util.*;

public class overloading {

    // data types
    public static void func(int a, int b) {
        System.out.println("two int -- dt");

    }

    public static void func(float a, float b) {
        System.out.println("two float -- dt");
    }

    // parameters
    public static void func(int a, int b, int c) {
        System.out.println("three int -- p");
    }

    public static void func(int a) {
        System.out.println("One int -- p");
    }

    public static void main(String args[]) {

        func(2, 3);
        func(3.5f, 6.7f);
        func(6, 7, 8);
        func(9);

    }

}