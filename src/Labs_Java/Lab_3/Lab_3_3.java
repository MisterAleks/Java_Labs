package Labs_Java.Lab_3;

/**
 * Created by Алексей on 03.02.2016.
 * Массив из 15 случайных целых чисел из отрезка [0;9]; Вывод массива на экран;
 * Подсчет в массиве чётных элементов и вывод этого количества на экран на отдельной строке.
 */
public class Lab_3_3 {
    public static void main(String[] args) {
        int[] nums = new int[15];

        for (int i = 0; i < 15; i++) {
            //Math.random() - [0,1); Справа не строгая граница, поэтому умножаем на 10.
            //При приведении типов останется 9
            nums[i] = (int) (Math.random() * 10);
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int n = 0;  //Переменная подсчета четных элементов
        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0)
                n++;

        System.out.println("Четных элементов в массиве = " + n);
    }
}
