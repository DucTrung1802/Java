import java.io.IOException;
import java.util.Scanner;

public class week0_3 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int input;

        System.out.println("Exercise 3");
        System.out.print("Enter a positive integer n: ");
        input = scan.nextInt();
        if (input <= 0) {
            throw new IOException("Input integer must be positive integer!");
        }

        System.out.println("==========");

        boolean divisibleByThree;
        if (input % 3 == 0) {
            divisibleByThree = true;
        } else {
            divisibleByThree = false;
        }
        System.out.println("Divisble by 3: " + divisibleByThree);

        boolean primeNumber = true;
        for (int i = 2; i <= Math.sqrt((double) input); i++) {
            if (input % i == 0) {
                primeNumber = false;
                break;
            }
        }
        System.out.println("Prime number: " + primeNumber);

        boolean perfectNumber = false;
        double sumDivisors = 0.0d;
        for (int i = 1; i <= (input / 2); i++) {
            if (input % i == 0) {
                sumDivisors += i;
            }
        }
        perfectNumber = input == sumDivisors;
//        System.out.println("Sum of divisors: " + sumDivisors);
        System.out.println("Perect number: " + perfectNumber);

        boolean perfectSquare = false;
        if (Math.sqrt((double) input) == Math.floor(Math.sqrt((double) input))) {
            perfectSquare = true;
        }
        System.out.println("Perfect square numbe: " + perfectSquare);
    }
}