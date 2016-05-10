package Labs_Java.Lab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 08.02.2016.
 * Создать метод, который будет выводить указанный массив на экран в строку.
 * С помощью созданного метода и метода из предыдущей задачи заполнить 5 массивов из 10 элементов
 * каждый случайными числами и вывести все 5 массивов на экран, каждый на отдельной строке.
 */
public class Lab_4_2 {
    public static void inLine(int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.format("%+-3d", A[i][j]);
            }
        }
    }

    //В Lab_4_1 метод rand() нужно применять в цикле, поэтому написан еще один метод, который применяет
    //метод rand() к конкретному массиву
    public static void randMassive(int A[][], int a, int b) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = Lab_4_1.rand(a, b);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //Объявление 5 массивов
        int[][] A1 = new int[2][5];
        int[][] A2 = new int[2][5];
        int[][] A3 = new int[2][5];
        int[][] A4 = new int[2][5];

        //Для проверки метода поменяем местами количество строк и столбцов в 5 массиве
        //Несмотря на это, он должен на выходе быть так же в строку из элементов и той же длины (10 элементов)
        int[][] A5 = new int[5][2];

        System.out.println("Введите диапазон случайных чисел:");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a, b;

        while (true) {
            try {
                a = Integer.parseInt(in.readLine());
                b = Integer.parseInt(in.readLine());
                break;
            } catch (Exception error) {
                System.out.println("Ошибка. Попробуйте еще раз:\n");
            }
        }

        //Заполним массивы случайными числами
        randMassive(A1, a, b);
        randMassive(A2, a, b);
        randMassive(A3, a, b);
        randMassive(A4, a, b);
        randMassive(A5, a, b);

        System.out.println();

        System.out.println("Первый массив:");
        inLine(A1);
        System.out.println();

        System.out.println("Второй массив:");
        inLine(A2);
        System.out.println();

        System.out.println("Третий массив:");
        inLine(A3);
        System.out.println();

        System.out.println("Четвертый массив:");
        inLine(A4);
        System.out.println();

        System.out.println("Пятый массив:");
        inLine(A5);
    }
}
