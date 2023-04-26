import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        /* Create two new BigDecimals */
        BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.123456789");

        /* Addition of two BigDecimals */
        BigDecimal addbd = bd1.add(bd2);
        System.out.println("Sum = " + addbd);

        /* Subtraction of two BigDecimals */
        BigDecimal subdb = bd1.subtract(bd2);
        System.out.println("Substraction = " + subdb);

        /* Multiplication of two BigDecimals */
        BigDecimal mulbd = bd1.multiply(bd2);
        System.out.println("Multiply = " + mulbd);

        /* Division of two BigDecimals */
        BigDecimal divbd = bd1.divide(bd2, 6, RoundingMode.HALF_UP);
        System.out.println("Division = " + divbd);

        /* Power of 2 of BigDecimals */
        BigDecimal powerbd = bd1.pow(2);
        System.out.println("Power of 2 = " + powerbd);

    }
}