import java.util.ArrayList;
import java.util.List;

public class Plane {
    private List<Shape> shapeList = new ArrayList<>();

    private boolean duplicatePoints(Point pointA, Point pointB) {
        return (pointA.getX() == pointB.getX()
                && pointA.getY() == pointB.getY());
    }

    public boolean foundShape(Circle circle) {
        for (Shape shape : this.shapeList) {
            if (shape instanceof Circle) {
                if (duplicatePoints(circle.getCenter(),
                        ((Circle) shape).getCenter())
                    && circle.getRadius() == ((Circle) shape).getRadius()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean foundShape(Triangle triangle) {
        for (Shape shape : this.shapeList) {
            if (shape instanceof Triangle) {
                if (duplicatePoints(triangle.getPointA(),
                        ((Triangle) shape).getPointA())
                    && duplicatePoints(triangle.getPointB(),
                        ((Triangle) shape).getPointB())
                    && duplicatePoints((triangle.getPointC()),
                        ((Triangle) shape).getPointC())) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean foundShape(Rectangle rectangle) {
        for (Shape shape : this.shapeList) {
            if (shape instanceof Rectangle) {
                if (duplicatePoints(rectangle.getPointA(),
                        ((Rectangle) shape).getPointA())
                    && duplicatePoints(rectangle.getPointB(),
                        ((Rectangle) shape).getPointB())
                    && duplicatePoints((rectangle.getPointC()),
                        ((Rectangle) shape).getPointC())
                    && duplicatePoints(rectangle.getPointD(),
                        ((Rectangle) shape).getPointD())) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void drawShape(Shape shape) {
        shapeList.add(shape);
        System.out.println("Added a " + shape.getType());
    }

    public void eraseShape(Shape shape) {

    }
}
