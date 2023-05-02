import java.io.IOException;
import java.util.Scanner;

public class SumCols {

    public static void inputMatrix(Scanner scan, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] addCols(int[][] matrix) {
        int[] sum_col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum_col[j] += matrix[i][j];
            }
        }
        return sum_col;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (n <= 0 || m <= 0) {
            throw new IOException("n must be a positive integer!");
        }
        int[][] matrix = new int[n][m];
        inputMatrix(scan, matrix);
//        printMatrix(matrix);
        int[] array = addCols(matrix);
        printArray(array);
    }
}