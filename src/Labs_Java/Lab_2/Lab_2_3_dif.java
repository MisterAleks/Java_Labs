package Labs_Java.Lab_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 01.02.2016.
 * Программа определения координатной четверти координаты
 */
public class Lab_2_3_dif {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите координаты точки, не лежащей на осях OX OY (два числа через Enter):");

        int x = ReadInt();  //Функция для быстрого ввода
        int y = ReadInt();

        if ((x == 0) || (y == 0)) {
            System.out.println("Ошибка: введен 0 либо неверное значение");
        } else {
            if (x > 0)
                if (y > 0)
                    System.out.println("1 четверть");
                else
                    System.out.println("4 четверь");
            else if (y > 0)
                System.out.println("2 четверть");
            else
                System.out.println("3 четверть");
        }
    }

    public static int ReadInt() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();

        //Проверка на ввод числа
        try {
            Integer.parseInt(s);
            return Integer.parseInt(s);
        } catch (Exception e) {
            return 0;   //0 - исключительная ситуация, поэтому можно приравнять к ошибке
        }
    }
}
