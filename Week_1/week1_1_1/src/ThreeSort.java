import java.util.Arrays;
import java.util.Scanner;

public class ThreeSort {

    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scan = new Scanner(System.in);
        array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = scan.nextInt();

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.println(array[i]);
            }
        }
    }

}