package Labs_Java.Lab_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 25.01.2016.
 * Поиск минимума двух чисел
 */
public class Lab_2_4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите два числа (через Enter):");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String m_str = in.readLine();
        String n_str = in.readLine();

        //Проверка на ввод чисел
        try {
            Integer.parseInt(m_str);
            Integer.parseInt(n_str);
        } catch (Exception e) {
            System.out.println("Ошибка, введены не числа");
            return;
        }

        int m = Integer.parseInt(m_str);
        int n = Integer.parseInt(n_str);

        System.out.println("Минимум двух чисел - " + Min(m, n));
    }

    public static int Min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
