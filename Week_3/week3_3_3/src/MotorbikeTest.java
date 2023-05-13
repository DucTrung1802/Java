import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeTest {
    public static void inputMotorbike(ArrayList<Motorbike> motorbikes, int n) {
        for (int i = 0; i < n; i++) {

        }
    }

    public static void ouputMotorbike(ArrayList<Motorbike> motorbikes) {

    }

    public static ArrayList<Motorbike> search(String manu, ArrayList<Motorbike> motorbikes) {

    }

    public static ArrayList<Motorbike> maxWeight(ArrayList<Motorbike> motorbikes) {

    }

    public static ArrayList<Motorbike> minQuanlity(ArrayList<Motorbike> motorbikes) {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer!");
        }
        int c = scan.nextInt();
        if (c < 1 || c > 3) {
            throw new IllegalArgumentException("c must be an integer in range 1 - 3");
        }
        ArrayList<Motorbike> motor_bike_array = new ArrayList<Motorbike>();
        inputMotorbike(motor_bike_array, n);

    }
}