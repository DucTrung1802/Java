import java.io.IOException;
import java.util.Scanner;

public class PrimesInArray {

    public static boolean isPrime(int k){
        boolean prime = true;
        if (k <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void inputArray(Scanner scan, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static void printPrimeInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
            }
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
        printPrimeInArray(array);
    }
}