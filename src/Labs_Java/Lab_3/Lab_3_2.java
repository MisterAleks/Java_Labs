package Labs_Java.Lab_3;

/**
 * Created by Алексей on 03.02.2016.
 * Массив из всех нечётных чисел от 1 до 99; вывод его на экран в строку,
 * а затем этот же массив тоже в строку, но в обратном порядке
 */
public class Lab_3_2 {
    public static void main(String[] args) {
        int[] nums = new int[50];
        int j = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                nums[j] = i;    //Заполнение массива нечетными числами
                j++;
            }
        }

        //Прямой порядок
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();   //Переход на новую строку

        //Обратный порядок
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
