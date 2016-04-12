package My;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import javax.swing.*;

/**
 * Created by Алексей on 17.02.2016.
 * Набор полезных функций
 */
public class Functions {

    //Быстрый ввод числа
    //TODO
    //Нет проверки на исключения, возвращает 0
    public static int readInt() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();

        //Проверка на ввод числа
        try {
            Integer.parseInt(s);
            return Integer.parseInt(s);
        } catch (Exception e) {
            //TODO
            //Вывод тестового окна сооющения об ошибке
            //JOptionPane.showConfirmDialog(null, "Неккоректный ввод. Замена на 0", "Ошибка", JOptionPane.OK_OPTION);
            System.out.println("Неккоректный ввод. Замена на 0");
            return 0;
        }
    }

    //Сортировка целочисленного одномерного массива по возрастанию "пузырьком"
    public static void sorting_Up_Bubble(int A[]) {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int c = A[i];
                    A[i] = A[j];
                    A[j] = c;
                }
            }
        }
    }
}