import java.util.*;

public class prime {

    public static boolean primefunc(int n) {

        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {

                    return false;
                }
            }

        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Prime : " + primefunc(num));

    }
}