import java.util.*;

public class reverse_var {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 325324;

        int rev = 0;

        while (n > 0) {
            int temp = n % 10;
            rev = (rev * 10) + temp;
            n /= 10;
        }

        System.out.println(rev);

    }
}