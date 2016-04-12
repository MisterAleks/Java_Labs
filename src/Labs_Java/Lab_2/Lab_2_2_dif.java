package Labs_Java.Lab_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 01.02.2016.
 * Программа поиска минимума четырех чисел
 */
public class Lab_2_2_dif {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 4 числа (через Enter):");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //Считывание строк
        String a_str = in.readLine(), b_str = in.readLine(),
                c_str = in.readLine(), d_str = in.readLine();

        try {
            Integer.parseInt(a_str);
            Integer.parseInt(b_str);
            Integer.parseInt(c_str);
            Integer.parseInt(d_str);
        } catch (Exception e) {
            System.out.println("Введено неверное значение");
            return;
        }

        //Перевод в числа
        int a = Integer.parseInt(a_str), b = Integer.parseInt(b_str),
                c = Integer.parseInt(c_str), d = Integer.parseInt(d_str);

        System.out.println("Минимальное из 4 чисел - " + min(min(a, b), min(c, d)));
    }

    public static int min(int a, int b) {
        if (a <= b)
            return a;
        else
            return b;
    }
}
