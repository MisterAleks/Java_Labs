package Labs_Java.Lab_2_Old;

import java.util.Scanner;

/**
 * Created by Алексей on 25.01.2016.
 */
public class Lab_2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вещественные A, B и C:");
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();

        System.out.print("B*C^A-((cos(A/B)/exp(B-A))*|A+B| = ");
        System.out.println(B * Math.pow(C, A) - (Math.cos(A / B) / Math.log(B - A)) * Math.abs(A + B));
        //TODO
        //exp - Функция натурального логарифма или экспонента, умноженная на (B - A)???
    }
}
