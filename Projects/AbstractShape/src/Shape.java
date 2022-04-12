public abstract class Shape {
    private ShapeType type;

    protected ShapeType getType() {
        return type;
    }

    protected void setType(ShapeType type) {
        this.type = type;
    }
}
