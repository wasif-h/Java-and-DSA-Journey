import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        while (n > 0) {
            int temp = n % 10;
            System.out.print(temp);
            n /= 10;
        }

    }
}