package Labs_Java.Lab_4;

/**
 * Created by Алексей on 17.02.2016.
 * Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.
 */
public class Lab_4_3 {

    public static void main(String[] args) {
        int[] A = {9, 5, 6, 2, 1, 3, 4, 7, 8, 0};

        System.out.println("Неотсортированный массив:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        My.Functions.sorting_Up_Bubble(A);

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
