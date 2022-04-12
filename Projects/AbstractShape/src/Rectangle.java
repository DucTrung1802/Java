public class Rectangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) throws Exception {
        if (isRectangle(pointA, pointB, pointC, pointD)) {
            super.setType(ShapeType.RECTANGLE);
            this.pointA = pointA;
            this.pointB = pointB;
            this.pointC = pointC;
            this.pointD = pointD;
        } else {
            throw new Exception("These four points do not form a rectangle!");
        }

    }

    private boolean isRectangle(Point pointA, Point pointB, Point pointC, Point pointD) {
        double AB_x = pointB.getX() - pointA.getX();
        double AB_y = pointB.getY() - pointA.getY();
        double BC_x = pointC.getX() - pointB.getX();
        double BC_y = pointC.getY() - pointB.getY();
        double CD_x = pointD.getX() - pointC.getX();
        double CD_y = pointD.getY() - pointC.getY();
        double DA_x = pointA.getX() - pointD.getX();
        double DA_y = pointA.getY() - pointD.getY();
        return ((AB_x * BC_x + AB_y * BC_y == 0) && (BC_x * CD_x + BC_y * CD_y == 0) && (CD_x * DA_x + CD_y * DA_y == 0));
    }
}
