import java.util.Scanner;

public class MyArray {

    // nhap n va nhap mang n so nguyen
    public static int[] arrayInput(Scanner in) {
        /* TODO */
        int n = in.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer!");
        }
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

    // in ra cac phan tu (cach nhau mot dau cach)
    public static void printArray(int[] arr) {
        /* TODO */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // tinh gia tri trung binh cua cac so hoan hao trong mang
    public static double averagePerfectNumbers(int[] arr) {
        /* TODO */
        double sum = 0.0d;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPerfect(arr[i])) {
                sum += arr[i];
                index += 1;
            }
        }
        if (index == 0) {
            return 0.0d;
        }
        return (double) Math.round((sum / index) * 10000) / 10000;
    }

    // kiem tra day doi xung
    public static boolean isSymmetricSequence(int[] arr) {
        /* TODO */
        boolean result = true;
        for (int i = 0; i < (arr.length / 2); i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    // sap xep mang tang dan
    public static void sort(int[] arr) {
        /* TODO */
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static boolean isPerfect(int n) {
        //begin edit
        boolean perfectNumber = false;
        double sumDivisors = 0.0d;
        if (n <= 0) {
            return perfectNumber;
        }
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                sumDivisors += i;
            }
        }
        perfectNumber = n == sumDivisors;
        return perfectNumber;
        //end edit
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = arrayInput(in);
        printArray(arr);
        System.out.println();
        System.out.println(averagePerfectNumbers(arr));
        System.out.println(isSymmetricSequence(arr));
        sort(arr);
        printArray(arr);
    }
}
