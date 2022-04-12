public class Main {
    public static void main(String[] args) throws Exception {
        Plane plane = new Plane();
        Circle circle_1 = new Circle(new Point(0, 0), 4);
        Circle circle_2 = new Circle(new Point(0, 0), 4);

        Triangle triangle_1 = new Triangle(new Point(0, 0), new Point(2, 2),
                new Point(5, 0));
        Triangle triangle_2 = new Triangle(new Point(0, 0), new Point(2, 2),
                new Point(6, 0));

        Rectangle rectangle_1 = new Rectangle(new Point(0, 0), new Point(0,
                2), new Point(2, 2), new Point(2, 0));
        Rectangle rectangle_2 = new Rectangle(new Point(0, 0), new Point(0,
                2), new Point(2, 2), new Point(2, 0));

        plane.drawShape(circle_1);
        plane.drawShape(triangle_1);
        plane.drawShape(rectangle_1);

        System.out.println(plane.foundShape(circle_2));
        System.out.println(plane.foundShape(triangle_2));
        System.out.println(plane.foundShape(rectangle_2));
    }
}
