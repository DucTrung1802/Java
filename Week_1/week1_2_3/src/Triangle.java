import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

class Triangle {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        double distance;
        distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        return distance;
    }

    static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        // begin edit
        double ab_ = getDistance(x1, y1, x2, y2);
        double ac_ = getDistance(x1, y1, x3, y3);
        double bc_ = getDistance(x2, y2, x3, y3);
        boolean condition_1 = (ac_ + bc_) > ab_;
        boolean condition_2 = (ab_ + bc_) > ac_;
        boolean condition_3 = (ab_ + ac_) > bc_;
        return (condition_1 && condition_2 && condition_3);
        //end edit
    }

    static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        // begin edit
        boolean value = false;
        if (isTriangle(x1, y1, x2, y2, x3, y3)) {
            double[] ab_vector = {(x1 - x2), (y1 - y2)};
            double[] ac_vector = {(x1 - x3), (y1 - y3)};
            double[] bc_vector = {(x2 - x3), (y2 - y3)};
            boolean condition_1 = (ab_vector[0] * ac_vector[0] + ab_vector[1] * ac_vector[1]) == 0.0d;
            boolean condition_2 = (ac_vector[0] * bc_vector[0] + ac_vector[1] * bc_vector[1]) == 0.0d;
            boolean condition_3 = (ab_vector[0] * bc_vector[0] + ab_vector[1] * bc_vector[1]) == 0.0d;

            double con_1 = (ab_vector[0] * ac_vector[0] + ab_vector[1] * ac_vector[1]);
            double con_2 = (ac_vector[0] * bc_vector[0] + ac_vector[1] * bc_vector[1]);
            double con_3 = (ab_vector[0] * bc_vector[0] + ab_vector[1] * bc_vector[1]);

//            System.out.println(con_1);
//            System.out.println(con_2);
//            System.out.println(con_3);

            value = (condition_1 || condition_2 || condition_3);
            //end edit
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scan.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scan.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scan.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scan.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = scan.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scan.nextDouble();

        boolean value_1 = isTriangle(x1, y1, x2, y2, x3, y3);
        boolean value_2 = isRightTriangle(x1, y1, x2, y2, x3, y3);

        System.out.println("is trangle ? " + value_1);
        System.out.println("is right trangle ? " + value_2);
    }
}