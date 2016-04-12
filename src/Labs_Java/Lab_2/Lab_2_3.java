package Labs_Java.Lab_2;

/**
 * Created by Алексей on 25.01.2016.
 * Прямоугольный треугольник из восьмёрок со сторонами 10 и 10
 */
public class Lab_2_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            //На каждой строке добавляется по символу => вырисовывается треугольник
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }

            //Отдельно, т.к. переходим на новую строку - println()
            System.out.println(8);
        }
    }
}
