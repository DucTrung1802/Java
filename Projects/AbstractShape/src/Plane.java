import java.util.ArrayList;
import java.util.List;

public class Plane {
    private List<Shape> shapeList = new ArrayList<>();

    protected boolean foundShape(Circle circle) {
        for (Shape shape : this.shapeList) {
            if (shape instanceof Circle) {
                if (circle.getCenter().equals(((Circle) shape).getCenter()) && circle.getRadius() == (((Circle) shape).getRadius())) {
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean foundShape(Triangle triangle) {
        return true;
    }

    protected boolean foundShape(Rectangle rectangle) {
        return true;
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
