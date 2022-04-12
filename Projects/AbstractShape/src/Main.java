public class Main {
    public static void main(String[] args) throws Exception {
        Plane plane = new Plane();
        Circle circle_1 = new Circle(new Point(0, 0), 4);
        Triangle triangle_1 = new Triangle(new Point(0, 0), new Point(2, 2), new Point(5, 0));
        plane.addShape(circle_1);
        plane.addShape(triangle_1);
    }
}
