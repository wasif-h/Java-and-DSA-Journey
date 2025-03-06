import java.util.*;

public class unaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // unary

        int a = 5;
        int b = a++;

        // use then change
        System.out.println(a + " " + b);

        int c = 2;
        int d = ++c;
        // change then use
        System.out.println(c + " " + d);

    }
}