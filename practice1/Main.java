package practice1;

import java.util.Scanner;

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
public class Main {

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

        Circle circle = new Circle(new Point(1, 2), 5);

        System.out.println("Points inside the circle:");

        for (Point p : points) {
            if (circle.contains(p)) {
                System.out.println(p);
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter X: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y: ");
        int y = scanner.nextInt();

        Point inputPoint = new Point(x, y);

        int count = 0;

        for (Point p : points) {
            if (p.equals(inputPoint)) {
                count++;
            }
        }

        System.out.println("Number of equal points: " + count);

        scanner.close();
    }
}
