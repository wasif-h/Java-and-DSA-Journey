import java.util.*;

public class level2 {

    public static void p1(int r, int c) {
        // hollow rectangle

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {

                    System.out.print("* ");
                } else {

                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        p1(3, 6);

    }
}