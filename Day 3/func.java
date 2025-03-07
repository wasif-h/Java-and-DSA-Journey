import java.util.*;

public class func {

    // this is a method , bcz it placed inside a class
    public static int sum(int a, int b, int c) {
        int ans = a + b + c;
        return ans;
    }

    public static void greet(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Thank You-----");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values a , b , c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Total Sum = " + sum(a, b, c));
        System.out.print("Greeting Amount : ");
        int n = sc.nextInt();
        greet(n);

    }
}