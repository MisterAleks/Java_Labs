package Labs_Java.Lab_2_Old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 25.01.2016.
 */
public class Lab_2_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два целых числа A и B:");
        String A_str = in.readLine();
        String B_str = in.readLine();
        double A = Integer.parseInt(A_str);
        double B = Integer.parseInt(B_str);

        //ratio - отношение
        double ratio = (double) (A / B);
        int part = (int) ratio;
        //fraction - доля
        double fraction = ratio % 1;

        System.out.println("Целая часть от деления A на B = " + part);
        System.out.println("Дробная часть от деления A на B = " + fraction);
    }
}
