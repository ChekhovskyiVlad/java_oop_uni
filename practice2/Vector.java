package practice2;

import java.util.Scanner;

/*Розробити клас для роботи з n-вимірним вектором (задається як масив
координат типу double), забезпечити розумну поведінку (обчислення
довжини (норми) вектора, отримання установка елементів, виведення
на екран, ...), конструктор копії. Протестувати клас на об'єктах. */
public class Vector {

    private double coordinates[][];

    void inputCoordinates(double coordinates[][]) {
        Scanner sc = new Scanner(System.in);
        double i = 0;
        while (true) {
            System.out.println("Enter values()");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                return;
            }
            double value = Double.parseDouble(input);
            coordinates[i][value];
            i++;
            sc.close();
        }
    }
}
