package practice1;

/*
Розробити та протестувати клас Point. Реалізувати метод перевірки
належності точки колу з центром в заданій точці та заданого радіусу.
Перевизначити методи toString та equals.
В main створити масив об'єктів цього класу, задати довільно
координати (зробити так, щоб координати повторювалися) та вивести
ті з них, які потрапили всередину кола з центром у точці (1, 2) та
радіусом 5.
З клавіатури ввести довільну точку та підрахувати кількість точок у
масиві рівних заданій.
 */
public class Point {

    private int x;
    private int y;

    private static final int CIRCLE_X = 1;
    private static final int CIRCLE_Y = 2;
    private static final int RADIUS = 5;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInsideCircle() {
        int dx = x - CIRCLE_X;
        int dy = y - CIRCLE_Y;
        return dx * dx + dy * dy <= RADIUS * RADIUS;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }

        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    public static void main(String[] args) {

        Point[] points = {
            new Point(1, 2),
            new Point(3, 4),
            new Point(1, 2),
            new Point(10, 10),
            new Point(-1, 2),
            new Point(5, 2),
            new Point(3, 4),
            new Point(0, 0)
        };

        System.out.println("Points inside the circle:");

        for (Point p : points) {
            if (p.isInsideCircle()) {
                System.out.println(p);
            }
        }
    }
}
