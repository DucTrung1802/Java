public class Main {
    public static void main(String[] args) throws Exception {
        Plane plane = new Plane();
        Circle circle_1 = new Circle(new Point(0, 0), 4);
        Triangle triangle_1 = new Triangle(new Point(0, 0), new Point(2, 2), new Point(5, 0));
        Rectangle rectangle_1 = new Rectangle(new Point(0, 0), new Point(0, 2), new Point(2, 2), new Point(2, 0));
        plane.drawShape(circle_1);
        plane.drawShape(triangle_1);
        plane.drawShape(rectangle_1);
    }
}
