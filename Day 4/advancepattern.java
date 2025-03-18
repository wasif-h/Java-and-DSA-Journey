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

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        p1(5, 5);

    }
}