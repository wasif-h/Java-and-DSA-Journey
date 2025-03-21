import java.util.*;

public class arraybasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array declaration

        int marks[] = new int[50];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println("Total Marks = " + marks.length +
                "\nMarks = " + (marks[0] + marks[1]));

        // simple way to write an array

        int num[] = { 1, 2, 3, 4, 5 };

        num[4] = 10;
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }

    }
}