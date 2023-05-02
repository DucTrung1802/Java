import java.io.IOException;
import java.util.Scanner;
//in ra cac so doi xung giua M và N
public class PalindromeNumbers{

    //ham kiem tra so nguyen k co la doi xung?
    //@para n kieu in
    //@return boolean
    public static boolean isPalindrome(int k)
    {
        boolean check;
        StringBuilder original_k = new StringBuilder();
        StringBuilder reversed_k = new StringBuilder();
        original_k.append(k);
        reversed_k.append(k);
        reversed_k.reverse();
        check = original_k.toString().equals(reversed_k.toString());

        return check;
    }

    public static void printPalindrome(int left, int right) throws IOException {
        if (left > right || left <= 0 || right <= 0) {
            throw new IOException("Bad arguments");
        }
        for (int i = left; i <= right; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find palindromic numbers between a range.");
        System.out.print("Enter the left limit: ");
        int left = scan.nextInt();
        System.out.print("Enter the right limit: ");
        int right = scan.nextInt();
        printPalindrome(left, right);
    }
}
