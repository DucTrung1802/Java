import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class MotorbikeTest {
    private static Scanner scan;

    public static void inputMotorbike(ArrayList<Motorbike> motorbikes, int n) {
        for (int i = 0; i < n; i++) {
            String id = scan.nextLine();
            String name = scan.nextLine();
            String manu = scan.nextLine();
            int quantity = Integer.parseInt(scan.nextLine());
            if (quantity <= 0) {
                throw new IllegalArgumentException("quantity must be positive integer!");
            }
            double price = Double.parseDouble(scan.nextLine());
            if (price <= 0) {
                throw new IllegalArgumentException("price must be positive integer!");
            }
            double weight = Double.parseDouble(scan.nextLine());
            if (weight <= 0) {
                throw new IllegalArgumentException("weight must be positive integer!");
            }
            String date = scan.nextLine();

            Motorbike motorbike = new Motorbike(id, name, manu, quantity, price, weight, date);
            motorbikes.add(motorbike);
        }
    }

    public static void ouputMotorbike(ArrayList<Motorbike> motorbikes) {
        for (int i = 0; i < motorbikes.size(); i++) {
            motorbikes.get(i).printMotorbike();
        }
    }

    public static ArrayList<Motorbike> search(String manu, ArrayList<Motorbike> motorbikes) {
        ArrayList<Motorbike> honda_array_list = new ArrayList<Motorbike>();
        for (Motorbike motorbike : motorbikes) {
            if (Objects.equals(motorbike.getManu(), manu)) {
                honda_array_list.add(motorbike);
            }
        }
        return honda_array_list;
    }

    public static ArrayList<Motorbike> maxWeight(ArrayList<Motorbike> motorbikes) {
        double max_weight = motorbikes.get(0).getWeight();
        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getWeight() > max_weight) {
                max_weight = motorbike.getWeight();
            }
        }
        ArrayList<Motorbike> max_weight_array_list = new ArrayList<Motorbike>();
        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getWeight() == max_weight) {
                max_weight_array_list.add(motorbike);
            }
        }
        return max_weight_array_list;
    }

    public static ArrayList<Motorbike> minQuanlity(ArrayList<Motorbike> motorbikes) {
        double min_quantity = motorbikes.get(0).getQuantity();
        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getQuantity() < min_quantity) {
                min_quantity = motorbike.getQuantity();
            }
        }
        ArrayList<Motorbike> min_quantity_array_list = new ArrayList<Motorbike>();
        for (Motorbike motorbike : motorbikes) {
            if (motorbike.getQuantity() == min_quantity) {
                min_quantity_array_list.add(motorbike);
            }
        }
        return min_quantity_array_list;
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer!");
        }
        ArrayList<Motorbike> motor_bike_array = new ArrayList<Motorbike>();
        inputMotorbike(motor_bike_array, n);
//        ouputMotorbike(motor_bike_array);
        int c = Integer.parseInt(scan.nextLine());
        if (c < 1 || c > 3) {
            throw new IllegalArgumentException("c must be an integer in range 1 - 3");
        }
        if (c == 1) {
            ArrayList<Motorbike> honda_array_list = search("Honda", motor_bike_array);
            ouputMotorbike(honda_array_list);
        } else if (c == 2) {
            ArrayList<Motorbike> max_weight_array_list = maxWeight(motor_bike_array);
            ouputMotorbike(max_weight_array_list);
        } else {
            ArrayList<Motorbike> min_quantity = minQuanlity(motor_bike_array);
            ouputMotorbike(min_quantity);
        }
    }

}