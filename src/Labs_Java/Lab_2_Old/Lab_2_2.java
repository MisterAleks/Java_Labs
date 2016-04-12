package Labs_Java.Lab_2_Old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 25.01.2016.
 */
public class Lab_2_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите A, B и C:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String A_str = in.readLine();
        String B_str = in.readLine();
        String C_str = in.readLine();
        int A = Integer.parseInt(A_str);
        int B = Integer.parseInt(B_str);
        int C = Integer.parseInt(C_str);

        int P = A + B + C;
        float p = P / 2;

        System.out.println("Периметр треугольника со сторонами A, B и C = " + P);

        System.out.print("Площадь треугольника со сторонами A, B и C = ");
        //Формула Геррона для вычисления площади
        System.out.println((float) (Math.sqrt(p * (p - A) * (p - B) * (p - C))));
    }
}
