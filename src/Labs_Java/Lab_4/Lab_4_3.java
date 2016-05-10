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

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[i]) {
                    int E = A[i];
                    A[i] = A[j];
                    A[j] = E;
                }
            }
        }

        System.out.println("Отсортированный массив:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
