package Labs_Java.Lab_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 25.01.2016.
 * Прямоугольник из восьмерок со сторонами m и n
 */
public class Lab_2_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите два числа m и n (через Enter):");

        //Необходимо в объект BufferedReader передать объект System.in для считывания, т.к. System.in считывает только
        //коды символов; следует учесть, что System.in и BufferedReader несовместимы,
        //поэтому используем InputStreamReader
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

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(8);    //Печать линии без последней 8
            }
            System.out.println(8);  //Печать последней 8 и переход на новую строку
        }
    }
}
