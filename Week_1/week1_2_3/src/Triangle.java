import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

class Triangle {
    public static BigDecimal getDistance(double x1, double y1, double x2, double y2) {
        BigDecimal x1_ = new BigDecimal(x1);
        BigDecimal y1_ = new BigDecimal(y1);
        BigDecimal x2_ = new BigDecimal(x2);
        BigDecimal y2_ = new BigDecimal(y2);
        BigDecimal distance;
        distance = ((x1_.subtract(x2_)).pow(2).add((y1_.subtract(y2_)).pow(2))).sqrt(new MathContext(20));
        return distance;
    }

    static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        // begin edit
        BigDecimal ab_ = getDistance(x1, y1, x2, y2);
        BigDecimal ac_ = getDistance(x1, y1, x3, y3);
        BigDecimal bc_ = getDistance(x2, y2, x3, y3);
        int condition_1 = (ab_.add(ac_)).compareTo(bc_);
        int condition_2 = (ab_.add(bc_)).compareTo(ac_);
        int condition_3 = (ac_.add(bc_)).compareTo(ab_);
        return (condition_1 + condition_2 + condition_3 == 3);
        //end edit
    }

    static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        // begin edit
        boolean value = false;
        if (isTriangle(x1, y1, x2, y2, x3, y3)) {
            BigDecimal ab_ = getDistance(x1, y1, x2, y2);
            BigDecimal ac_ = getDistance(x1, y1, x3, y3);
            BigDecimal bc_ = getDistance(x2, y2, x3, y3);
            BigDecimal condition_1 = ab_.pow(2).subtract(ac_.pow(2).add(bc_.pow(2))).setScale(6, RoundingMode.HALF_UP);
            BigDecimal condition_2 = ac_.pow(2).subtract(ab_.pow(2).add(bc_.pow(2))).setScale(6, RoundingMode.HALF_UP);
            BigDecimal condition_3 = bc_.pow(2).subtract(ab_.pow(2).add(ac_.pow(2))).setScale(6, RoundingMode.HALF_UP);

            System.out.println(condition_1);
            System.out.println(condition_2);
            System.out.println(condition_3);

//            value = (condition_1 * condition_2 * condition_3) == 0;
//        }
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