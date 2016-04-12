package Labs_Java.Lab_3;

/**
 * Created by Алексей on 03.02.2016.
 * Двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 */
public class Lab_3_4 {
    public static void main(String[] args) {
        int[][] nums = new int[8][5];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                //Math.random() - [0,1); Справа не строгая граница, поэтому умножаем на 90.
                //При приведении типов останется 89
                nums[i][j] = (int) (Math.random() * 90) + 10;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
