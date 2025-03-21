import java.util.*;

public class advancepattern {

    public static void p1(int x, int y) {
        // hollow rec

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (i == 1 || i == x || j == 1 || j == y) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void p2(int x, int y) {
        // rev pyramid

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void p3(int x, int y) {
        // inverted half pyramid with numbers

        for (int i = 1; i <= x; i++) {
            int count = 1;
            for (int j = 1; j <= x - i + 1; j++) {

                System.out.print(count);
                count++;

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void p4(int x, int y) {
        // zero one pyramid

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        p1(5, 5);
        p2(5, 5);
        p3(5, 5);
        p4(5, 5);

    }
}