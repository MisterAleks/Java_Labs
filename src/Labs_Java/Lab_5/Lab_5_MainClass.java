package Labs_Java.Lab_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 16.03.2016.
 * 1. Создайте в классе Circle метод, вычисляющий длину окружности.
 * Прим.: Метод Circle скопирован из задания к лабораторной работе
 * <p/>
 * 2. Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости
 * с диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что требуется создать обычный метод, применимый
 * к уже существующему объекту, а не конструктор создающий новый объект.
 * <p/>
 * 3. Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью,
 * координаты центра и радиус окружности пользователь вводил с клавиатуры.
 * <p/>
 * 4. Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.
 * <p/>
 * 5.	Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке. Учтите,
 * что возможен вариант, когда одна окружность содержится внутри другой и при этом
 * всё равно возможно касание в одной точке.
 */

class Circle {
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
    /*
    //конструктор по умолчанию, теперь сразу после создания объекта будем
    //получать окружность единичного радиуса с центром в начале координат
    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    */
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

//Главный класс с методом main. В нем проверяем условия задач.
public class Lab_5_MainClass {
    public static void main(String[] args) throws IOException {
        //ЗАДАНИЕ №1
        Circle cir1 = new Circle();
        System.out.println("Длина окружности радиуса " + cir1.r + " = " + cir1.lengthCircle());

        //ЗАДАНИЕ №2
//        System.out.println();
//        cir1.randomCentreCircle();
//        System.out.println("Новые координаты радиуса круга: (" + cir1.x + ";" + cir1.y + ")");

        //ЗАДАНИЕ №3
        System.out.println();
        Circle cir2 = new Circle();

        //ЗАДАНИЕ №4
        System.out.println();
        System.out.println("Расстояние между центрами первой и второй окружностей = " + cir1.distanceCircle(cir2));

        //ЗАДАНИЕ №5
        System.out.println();
        if (cir1.touchingCircle(cir2)) {
            System.out.println("Данные окружности касаются в одной точке");
        } else {
            System.out.println("Данные окружности не касаются в одной точке");
        }
    }
}