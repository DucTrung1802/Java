import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShapeTest {
    private static Scanner scan = new Scanner(System.in);


    public static void sort(ArrayList<Shape> shapes) {
        int n = shapes.size();

        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                if ((shapes.get(i)).compareTo(shapes.get(j)) > 0) {
                    Shape temp = shapes.get(i);
                    shapes.set(i, shapes.get(j));
                    shapes.set(j, temp);
                }
            }
    }

    public static void main(String[] args) {
//        ArrayList<Shape> shapes = new ArrayList<Shape>();
//
//        // Thêm vào mảng shapes 3 hình vuông, 1 hình chữ nhật, 2 hình tròn
//        shapes.add(new Square(5));
//        shapes.add(new Square(10));
//        shapes.add(new Square(4));
//        shapes.add(new Rectangle(2, 3));
//        shapes.add(new Circle(3));
//        shapes.add(new Circle(2));
//        sort(shapes);
//
//        // In ra diện tích các hình theo thứ tự tăng dần
//        for (int i = 0; i < shapes.size(); i++) {
//            String className = shapes.get(i).getClass().getName();
//            System.out.println(className);
//            // Nếu là hình tròn, ép kiểu để gọi phương thức getFrameArea của lớp Circle
//            if (className.equals("Circle")) System.out.printf("%8.2f\n", ((Circle) shapes.get(i)).getFrameArea());
//            else System.out.printf("%8.2f\n", (shapes.get(i)).getArea());
//        }

        ShapeTest shape_test = new ShapeTest();
        ArrayList<Shape> shapes = shape_test.readData();
        System.out.println(getMaxCircle(shapes).getArea());
        System.out.println(getMaxSquare(shapes).getArea());
        System.out.println(getMaxRectangle(shapes).getArea());

        scan.close();

    }

    public static Circle getMaxCircle(ArrayList<Shape> shapes) {
        double max_area = 0.0d;
        Circle max_circle = null;
        for (Shape shape : shapes) {
            if (shape instanceof Circle && shape.getArea() > max_area) {
                max_area = shape.getArea();
                max_circle = (Circle) shape;
            }
        }
        return max_circle;
    }

    public static Square getMaxSquare(ArrayList<Shape> shapes) {
        double max_area = 0.0d;
        Square max_square = null;
        for (Shape shape : shapes) {
            if (shape instanceof Square && shape.getArea() > max_area) {
                max_area = shape.getArea();
                max_square = (Square) shape;
            }
        }
        return max_square;
    }

    public static Rectangle getMaxRectangle(ArrayList<Shape> shapes) {
        double max_area = 0.0d;
        Rectangle max_rectangle = null;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle && shape.getArea() > max_area) {
                max_area = shape.getArea();
                max_rectangle = (Rectangle) shape;
            }
        }
        return max_rectangle;
    }


    public ArrayList<Shape> readData() {
        int n = Integer.parseInt(scan.nextLine());
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer!");
        }
        ArrayList<Shape> shape_array_list = new ArrayList<Shape>();
        for (int i = 0; i < n; i++) {
            char shape_type = scan.next().charAt(0);
            if (shape_type == 'c') {
                double radius = scan.nextDouble();
                Circle circle = new Circle(radius);
                shape_array_list.add(circle);
            } else if (shape_type == 's') {
                double side = scan.nextDouble();
                Square square = new Square(side);
                shape_array_list.add(square);
            } else if (shape_type == 'r') {
                double length = scan.nextDouble();
                double width = scan.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                shape_array_list.add(rectangle);
            } else {
                throw new IllegalArgumentException("Shape type is not supported. Supported shape type: c, s, r");
            }

        }
        return shape_array_list;
    }
}
