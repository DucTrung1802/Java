import java.util.Scanner;

public class Main {

    public static void inputArray(int array[], Scanner scan) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input element " + i + ": ");
            array[i] = scan.nextInt();
        }
    }

    public static void outputArray(int[] array) {
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) throws ArithmeticException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int number_of_element = scan.nextInt();
        if (number_of_element <= 0) {
            throw new ArithmeticException("Bad parameter");
        }
        int[] array = new int[number_of_element];
        inputArray(array, scan);
        outputArray(array);
    }
}