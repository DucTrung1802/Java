import java.util.Arrays;

public class ThreeSort {

    public static void main(String[] args) {
        int[] array = new int[args.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

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