public class Rectangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        super.setType(ShapeType.RECTANGLE);
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }
}
