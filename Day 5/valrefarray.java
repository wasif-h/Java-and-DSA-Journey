import java.util.*;

public class valrefarray {

    public static void update(int arr[], int var) {
        var = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
    }

    public static void show(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cat = 5;
        int num[] = { 40, 45, 50 };

        update(num, cat); 
        // here array will pass by reference but normal variable would be pass by value 

        System.out.println(cat);
        show(num);

    }
}