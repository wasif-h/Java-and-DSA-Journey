import java.util.*;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // FIND THE LARGEST NUMBER

        System.out.println("Enter a , b , c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is bigger -> " + a);
        } else if (b >= c) {
            System.out.println("B is bigger ->" + b);
        } else {
            System.out.println("C is bigger ->" + c);
        }

    }
}