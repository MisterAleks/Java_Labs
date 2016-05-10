package Labs_Java.Lab_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 10.05.2016.
 */
public class Circle {
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус

    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r);
    }

    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }

    //ЗАДАНИЕ №1
    //Длина окружности
    public double lengthCircle() {
        //L = 2 * PI * r
        return 2 * Math.PI * this.r;
    }

    //ЗАДАНИЕ №2
    public void randomCentreCircle() {
        x = (int) (Math.random() * 199) - 99;
        y = (int) (Math.random() * 199) - 99;
    }

    public void zoomCircle(double k) {
        r = r * k;
    }

    //ЗАДАНИЕ №3
    public Circle() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты центра и радиус окружности:");

        String x_str = in.readLine();
        String y_str = in.readLine();
        String r_str = in.readLine();

        try {
            x = Integer.parseInt(x_str);
            y = Integer.parseInt(y_str);
            r = Integer.parseInt(r_str);
        } catch (Exception e) {
            System.out.println("Ошибка, неккоректный ввод. Значения изменены на стандартные (0, 0, 1)");
            x = 0.0;
            y = 0.0;
            r = 1.0;
        }

        if (r < 0) {
            System.out.println("Ошибка, радиус отрицательный. Радиус изменен на единичный");
            r = 1.0;
        }
    }

    //ЗАДАНИЕ №4
    public double distanceCircle(Circle cir) {
        //Для начала нужно найти координаты вектора, соединяющего центры окружностей
        //Для этого нужно из координат второй окружности вычесть координаты второй окружности
        //После этого по формуле sqrt(a^2 + b^2), где a и b - координаты вектора, находится длина вектора
        //Длина вектора - искомое расстояние между центрами окружностей

        double a = cir.x - this.x;
        double b = cir.y - this.y;

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    //ЗАДАНИЕ №5
    public boolean touchingCircle(Circle cir) {
        //Окружности могут касаться в 2 случаях:
        //  •Когда одна из окружностей внутри другой и меньше ее.
        //Для этого мы можем посчитать расстояние между центрами. Оно должно быть равно
        //разности между большим и малым радиусами
        //  •Когда окружности касаются извне. Тогда расстояние между их центрами будет равно сумме радиусов
        //окружностей

        double a = cir.x - this.x;
        double b = cir.y - this.y;

        //Расстояние
        double s = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        if (s == Math.abs(this.r - cir.r) || s == this.r + cir.r) {
            return true;
        } else {
            return false;
        }
    }
}
