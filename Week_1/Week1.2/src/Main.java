import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int input;

        System.out.println("Exercise 2");
        System.out.print("Enter a positive integer n: ");
        input = scan.nextInt();
        if (input <= 0) {
            throw new IOException("Input integer must be positive integer!");
        }

        System.out.println("==========");

        int sumFromOne = (input + 1) * input / 2;
        System.out.println("Addition from 1 to n: " + sumFromOne);

        int sumEvenNumber = 0;
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                sumEvenNumber += i;
            }
        }
        System.out.println("Addition of even numbers from 1 to n: " + sumEvenNumber);

        double sumOfInvert = 0.0d;
        for (int i = 1; i <= input; i++) {
            sumOfInvert += (1.0d/i);
        }
        System.out.println("Addition of invert numbers from 1 to n: " + sumOfInvert);

    }
}