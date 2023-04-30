import java.util.Scanner;
import java.util.Arrays;

public class week0_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array_int = new int[3];

        System.out.println("Exercise 1");
        System.out.print("Input first integer: ");
        array_int[0] = scan.nextInt();
        System.out.print("Input second integer: ");
        array_int[1] = scan.nextInt();
        System.out.print("Input third integer: ");
        array_int[2] = scan.nextInt();

        System.out.println("==========");
        System.out.println("Maximum value: " + Arrays.stream(array_int).max().getAsInt());
        System.out.println("Minimum value: " + Arrays.stream(array_int).min().getAsInt());
    }
}