import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exp {

    public static BigDecimal getFactorial(long n) {
        if (n < 0) {
            throw new ArithmeticException("Cannot find factorial of negative integer!");
        }
        if (n == 0) {
            return (new BigDecimal(1));
        } else {
            BigDecimal factorial = new BigDecimal(1);
            BigDecimal n_ = new BigDecimal(n);
            for (BigDecimal i = new BigDecimal(1); i.compareTo(n_) <= 0; i = i.add(new BigDecimal(1))) {
                factorial = factorial.multiply(i);
            }
            return factorial;
        }
    }

    public static double dblExp(double x, int n) {
        //begin editing
        BigDecimal exp_x = new BigDecimal(0);
        BigDecimal x_ = new BigDecimal(x);
        for (int i = 0; i <= n; i++) {
            exp_x = exp_x.add((x_.pow(i)).divide(getFactorial(i), 15, RoundingMode.FLOOR));
        }

        return (Math.round(exp_x.doubleValue() * 1000.0) / 1000.0);
        //end editing
    }

    public static void main(String args[]) {
        System.out.println(dblExp(Double.parseDouble(args[0]), Integer.parseInt(args[1])));
    }
}