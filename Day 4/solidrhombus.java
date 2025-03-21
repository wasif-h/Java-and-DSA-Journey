import java.util.*;

public class solidrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            for (int star = 1; star <= n; star++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}