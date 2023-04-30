import java.util.Arrays;
import java.util.Scanner;

public class ThreeSort {

    public static void mySort(int input_length, Scanner scan) {
        /* Input */
        if (input_length <= 0) {
            return;
        }
        int[] array = new int[input_length];
        System.out.println("Enter " + input_length + " integers.");
        for (int i = 0; i < input_length; i++) {
            System.out.print("Enter number with index " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        /* Sort */
        Arrays.sort(array);

        /* Output */
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array number: ");
        int array_length = scan.nextInt();
        if (array_length <= 0) {
            return;
        }
        mySort(array_length, scan);
    }
}