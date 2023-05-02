import java.io.IOException;
import java.util.Scanner;

/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng,
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
//import <libraries needed here>

public class FindMinMax{

    public static int findMin(int Array[]){
        //editing here
        int min = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        return min;
    }

    public static int findMax(int Array[]){
        //editing here
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        return max;
    }

    public static void inputArray(Scanner scan, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 0) {
            throw new IOException("n must be a positive integer!");
        }
        int[] array = new int[n];
        inputArray(scan, array);
        System.out.print(findMin(array));
        System.out.print(" ");
        System.out.print(findMax(array));
    }

}