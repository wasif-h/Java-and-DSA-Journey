import java.util.*;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();

        String ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);

    }
}