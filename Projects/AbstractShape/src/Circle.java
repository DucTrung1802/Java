public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) throws Exception {
        if (isCircle(radius)) {
            super.setType(ShapeType.CIRCLE);
            this.center = center;
            this.radius = radius;
        } else {
            throw new Exception("Radius of a circle is not a negative number!");
        }
    }

    private boolean isCircle(double radius) {
        return radius > 0;
    }
}
