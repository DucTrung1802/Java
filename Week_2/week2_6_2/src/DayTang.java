import java.io.IOException;
import java.util.Scanner;

public class DayTang {

    public static void inputArray(Scanner scan, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static void checkArray(int[] array) {
        boolean value = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i+1]) {
                value = false;
                break;
            }
        }
        if (value) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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
        checkArray(array);
    }
}