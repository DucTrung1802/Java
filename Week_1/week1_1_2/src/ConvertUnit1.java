public class ConvertUnit1 {
    public static void main(String[] args) {
        double inInches = (Double.parseDouble(args[0]) * 39.3701);
        inInches = Math.round(inInches * 100.0) / 100.0;
        System.out.println(inInches);
    }
}