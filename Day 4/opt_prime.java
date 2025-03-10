import java.util.*;

public class opt_prime {

    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int rn = sc.nextInt();

        for (int i = 2; i < rn; i++) {
            if (prime(i)) {
                System.out.println(i);
            }
        }

    }
}