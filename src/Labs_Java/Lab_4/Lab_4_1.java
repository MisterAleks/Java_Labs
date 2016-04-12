package Labs_Java.Lab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 08.02.2016.
 * Создать статический метод, который будет иметь два целочисленных параметра a и b,
 * и в качестве своего значения возвращать случайное целое число из отрезка [a;b]. С помощью
 * данного метода заполнить массив из 20 целых чисел и вывести его на экран.
 */
public class Lab_4_1 {
    public static int rand(int a, int b) {
        //Проверка на корректность интервала вводимых значений
        if (a > b) {
            int c;
            c = b;
            b = a;
            a = c;
        }

        //Math.random() - число из диапазона [0;1); Левая крайняя = 0 + a = a
        //Правая крайняя - b; Если бы граница была строгая, то получилось бы так: b - a + 1 + a = b + 1;
        //Но граница не строгая, поэтому +1 нужен специально, чтобы при отбрасывании дробной части осталось только b;
        return (int) (Math.random() * (b - a + 1)) + a;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Введите a и b: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String a_str = in.readLine();
        String b_str = in.readLine();
        int a = Integer.parseInt(a_str);
        int b = Integer.parseInt(b_str);

        //Массив 4х5 = 20 чисел
        int[][] A = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = rand(a, b);
                System.out.format("%-+3d ", A[i][j]);
            }
            System.out.println();
        }
    }
}
