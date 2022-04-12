import java.util.ArrayList;
import java.util.List;

public class Plane {
    private List<Shape> shapeList = new ArrayList<>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void addShape(Shape shape) {
        shapeList.add(shape);
        System.out.println("Added a " + shape.getType());
    }

    public void eraseShape(Shape shape) {

    }
}
