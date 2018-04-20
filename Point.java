public class Point {
    private double x = 0, y = 0;

    public Point() {
    }

    public Point(double x, double y) {
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return super.toString()
                + "X = " + getX()
                + "Y = " + getY();
    }
}
