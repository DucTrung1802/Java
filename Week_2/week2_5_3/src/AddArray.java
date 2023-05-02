import java.io.IOException;
import java.util.Scanner;

/**
 * Chương trình cộng 2 mảng số nguyên:
 * Cho phép đọc số nguyên n, và 2 mảng với n phần tử nguyên
 * Tính và in ra mảng có phần tử là tổng phần tử tương ứng
 * của 2 mảng nhập vào trên một dòng, cách nhau bởi khoảng trống.
 * Yêu cầu giữ cấu trúc các hàm/phương thức đã có, có thể bổ sung nếu cần
 */
class AddArray {

    // hàm/phương thức SumArray trả về tổng 2 mảng nguyên A, B
    // .....{.......}

    // hàm/phương thức printArray để in một mảng A ra màn hình

    public static void inputArray(Scanner scan, int[] array, String name) {
//        System.out.println();
//        System.out.println("Input for array " + name);
        for (int i = 0; i < array.length; i++) {
//            System.out.print("Input element index [" + i + "]: ");
            array[i] = scan.nextInt();
        }
    }

    public static int[] SumArray(int[] array_1, int[] array_2) {
        int[] sum_array = new int[1];
        if (array_1.length == array_2.length) {
            sum_array = new int[array_1.length];
            for (int i = 0; i < sum_array.length; i++) {
                sum_array[i] = array_1[i] + array_2[i];
            }
        }
        return sum_array;
    }

    public static void printArray(int[] array, String name) {
//        System.out.println();
        if (!name.isEmpty()) {
            System.out.print(name + " = ");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter positive integer n: ");
        int n = scan.nextInt();
        if (n <= 0) {
            throw new IOException("n must be a positive integer!");
        }
        int[] array_1 = new int[n];
        int[] array_2 = new int[n];
        inputArray(scan, array_1, "A");
        inputArray(scan, array_2, "B");
//        printArray(array_1, "A");
//        printArray(array_2, "B");
        int[] array_3 = SumArray(array_1, array_2);
        printArray(array_3, "");
    }
}