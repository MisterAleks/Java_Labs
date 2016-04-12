package Labs_Java.Lab_2_Old;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Алексей on 25.01.2016.
 */
public class Lab_2_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите вещественное число A:");

        Scanner in = new Scanner(System.in);

        double A = in.nextDouble();

        System.out.println("Введите целое число B:");

        int B = in.nextInt();

        //grad - степень
        double grad = Math.pow(A, B);
        //part - часть
        int part = (int) grad;    //Используется явное приведение типов, поэтому остается только целая часть числа
        //root - корень
        double root = Math.sqrt((int) A);

        System.out.println("A в степени B = " + grad);
        System.out.println("Целая часть A в степени B = " + part);
        System.out.println("Корень квадратный из целой части числа A = " + root);
    }
}
