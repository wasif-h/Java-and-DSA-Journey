import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Calculate ");
        int n = sc.nextInt();
        boolean is_prime = true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                is_prime = false;
            }

        }

        System.out.println((is_prime==true)?"Prime":"Not Prime");

    }
}