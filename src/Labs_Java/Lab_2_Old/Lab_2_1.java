package Labs_Java.Lab_2_Old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 25.01.2016.
 */
public class Lab_2_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите A и B:");
        //Необходимо в объект BufferedReader передать объект System.in для считывания, 
        //т.к. System.in считывает только коды символов; следует учесть, что System.in и BufferedReader несовместимы,
        //поэтому используем InputStreamReader
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String A_str = in.readLine();
        String B_str = in.readLine();   //Считываем строку
        int A = Integer.parseInt(A_str);
        int B = Integer.parseInt(B_str);    //Переводим строку в число
        System.out.println("Разность = " + (A - B));
        System.out.println("Сумма = " + (A + B));
        System.out.println("Отношение = " + (float) A / B);
        System.out.println("Произведение = " + A * B);
    }
}
