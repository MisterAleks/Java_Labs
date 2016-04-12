package Labs_Java.Lab_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 25.01.2016.
 * Программа проверки идентичности имен
 */
public class Lab_2_1_dif {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите два имени (через Enter):");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s1 = in.readLine();
        String s2 = in.readLine();

        //Проверка исключения ввода чисел
        for (int i = 0; i < 10; i++)
            if ((s1.contains(Integer.toString(i))) || (s2.contains(Integer.toString(i)))) {
                System.out.println("Ошибка, в имени присутствуют цифры");
                return;
            }

        if (s1.length() == s2.length()) {
            int j = 0;   //Для счета совпадений
            for (int i = 0; i < s1.length(); i++)   //Перебор всей строки
                if (s1.charAt(i) == s2.charAt(i))
                    j++;
            if (j == s1.length())
                System.out.println("Имена идентичны");
            else
                System.out.println("Длины имен равны");
        } else
            System.out.println("Имена различны");
    }
}
