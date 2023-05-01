class Triangle {
    static boolean isTriangle(double a, double b, double c) {
        // begin edit
        boolean condition_1 = (a + b) > c;
        boolean condition_2 = (a + c) > b;
        boolean condition_3 = (b + c) > a;
        return (condition_1 && condition_2 && condition_3);
        //end edit
    }

    static double getArea(double a, double b, double c) {
        // begin edit
        /* Using Heron's formula */
        double area = 0.0d;
        if (isTriangle(a, b, c)) {
            double p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        return area;
        //end edit
    }

    public static void main(String[] args) {
        System.out.println(getArea(12, 5, 13));
    }
}