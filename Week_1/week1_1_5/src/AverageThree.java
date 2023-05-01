public class AverageThree {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        double sum = 0.0d;
        double average = 0.0d;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }
        average = sum / args.length;
        System.out.println(average);
    }
}