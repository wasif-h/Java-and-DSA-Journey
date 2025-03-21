import java.util.*;

public class largesmall {

    public static int largestnum(int arr[]) {
        int largest = Integer.MIN_VALUE; // - infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallestnum(int arr[]) {
        int smallest = Integer.MAX_VALUE; // + infinity

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = { 79, 21, 333, 4, 23, 89, 67, 23, 11, 5, 80 };

        System.out.println("Largest : " + largestnum(num));
        System.out.println("Smallest : " + smallestnum(num));

    }
}