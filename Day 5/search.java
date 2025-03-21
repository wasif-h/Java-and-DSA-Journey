import java.util.*;

public class search {

    public static int linear(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = { 3, 4, 23, 89, 67, 23, 11, 5, 80 };
        System.out.print("Enter Target : ");
        int target = sc.nextInt(); // index 3

        int ans = linear(num, target);
        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found >> Index = " + ans);
        }

    }
}