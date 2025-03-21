import java.util.*;

public class butterfly {

// *                     * 
// * *                 * * 
// * * *             * * * 
// * * * *         * * * * 
// * * * * *     * * * * * 
// * * * * * * * * * * * * 
// * * * * * * * * * * * * 
// * * * * *     * * * * * 
// * * * *         * * * * 
// * * *             * * * 
// * *                 * * 
// *                     * 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int f = 1; f <= i; f++) {
                System.out.print("* ");
            }
            for (int g = 1; g <= (2 * n) - (i * 2); g++) {
                System.out.print("  ");
            }
            for (int f = 1; f <= i; f++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            for (int f = 1; f <= i; f++) {
                System.out.print("* ");
            }
            for (int g = 1; g <= (2 * n) - (i * 2); g++) {
                System.out.print("  ");
            }
            for (int f = 1; f <= i; f++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}