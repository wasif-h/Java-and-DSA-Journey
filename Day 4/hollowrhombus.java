import java.util.*;

public class hollowrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // basic rectangle but previous loop will make it hollow rectangle
            for (int star = 1; star <= n; star++) {

                if (i == 1 || i == n || star == 1 || star == n) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }

    }
}