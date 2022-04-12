public class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double area;

    public Triangle(Point pointA, Point pointB, Point pointC) throws Exception {
        if (isTriangle(pointA, pointB, pointC)) {
            super.setType(ShapeType.TRIANGLE);
            this.pointA = pointA;
            this.pointB = pointB;
            this.pointC = pointC;
        } else {
            throw new Exception("Area of this triangle is not greater than zero!");
        }
    }

    private boolean isTriangle(Point pointA, Point pointB, Point pointC) {
        return this.calculateArea(pointA, pointB, pointC) > 0;
    }

    private double calculateArea(Point pointA, Point pointB, Point pointC) {
//        Derived from shoelace formula
        double result = 0.5 * Math.abs(pointA.getX() * (pointB.getY() - pointC.getY()) + pointB.getX() * (pointC.getY() - pointA.getY()) + pointC.getX() * (pointA.getY() - pointB.getY()));
        this.area = result;
        return this.area;
    }

    public double getArea() {
        return this.area;
    }
}
