import java.io.IOException;
import java.util.Scanner;

/**
 * Chương trình xóa phần tử trùng lặp trong mảng, chỉ để lại phần tử xuất hiện đầu tiên
 * import các thư viện (nếu cần thiết) - Bổ sung các phương thức/hàm (nếu cần thiết)
 * Giữ lại khung chương trình và phương thức xoaPhantu ở dưới
 **/
public class XoaPTtrung {

    public static int[] xoaPhantu(int A[], int k) {
        if (A == null || k < 0 || k >= A.length) {
            return A;
        }
        int[] array = new int[A.length - 1];
        for (int i = 0, j = 0; i < A.length; i++) {
            if (i == k) {
                continue;
            }
            array[j++] = A[i];
        }
        return array;
    }

    public static boolean inArray(int[] array, int value) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static int[] removeDuplications(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return removeDuplications(xoaPhantu(array, j));
                }
            }
        }
        return array;
    }

    public static void inputArray(Scanner scan, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String Args[]) throws IOException {
        // Nhập dữ liệu từ đây - bổ sung mã lệnh
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 0) {
            throw new IOException("n must be a positive integer!");
        }
        int[] array = new int[n];
        inputArray(scan, array);
        printArray(removeDuplications(array));
    }
}