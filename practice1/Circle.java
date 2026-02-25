package practice1;

public class Circle {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean contains(Point p) {
        int dx = p.getX() - center.getX();
        int dy = p.getY() - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }
}
