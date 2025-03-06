import java.util.*;

public class variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");

        byte a = 10;
        int b = 3;
        float c = 34.45f;
        long ans = (long) (a + b + c);

        System.out.println(ans);

        char ch = 'a';
        int nm = ch;
        System.out.println(nm);

        // expression automatically turns into int if it has data type char, byte , short

        // java would pick the largest size data type if there are similer variable in a expression

    }
}