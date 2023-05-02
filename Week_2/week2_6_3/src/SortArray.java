import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void inputArray(Scanner scan, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 0) {
            throw new IOException("n must be a positive integer!");
        }
        int[] array = new int[n];
        inputArray(scan, array);
        sortArray(array);
        printArray(array);
    }
}