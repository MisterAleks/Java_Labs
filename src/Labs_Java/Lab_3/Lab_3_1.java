package Labs_Java.Lab_3;

/**
 * Created by Алексей on 03.02.2016.
 * Массив из всех чётных чисел от 2 до 20; вывод элементов массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом, а затем в столбик
 * (отделяя один элемент от другого началом новой строки)
 */
public class Lab_3_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        //Вывод элементов массива в строку
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();   //Переход строки

        //Вывод элементов массива в столбик
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
