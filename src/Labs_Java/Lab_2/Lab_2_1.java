package Labs_Java.Lab_2;

/**
 * Created by Алексей on 25.01.2016.
 * Счет четных чисел в диапазоне [1..100]
 */
public class Lab_2_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            if ((i % 2) == 0) {
                System.out.println(i);
            }
    }
}
