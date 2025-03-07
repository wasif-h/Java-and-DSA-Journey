import java.util.*;

public class binomial {

    public static int fact(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) {
            f *= i;
        }
        return f;
    }

    public static int bino(int n, int r) {

        int ans = fact(n) / (fact(r) * fact(n - r));
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Binomial Calculator\nEnter n and r\n------------------");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial = " + bino(n, r));

    }
}