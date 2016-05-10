package Labs_Java.Lab_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 10.05.2016.
 * Задание №1
 */

public class Horse {
    private String name;

    //Ввод имени происходит внутри конструктора без параметра с использованием объекта BufferedReader
    public Horse() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Введите имя лошади:");
                name = in.readLine();
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Ошибка ввода имени\n");
            }
        }
    }

    public String getName() {
        return this.name;
    }
}

class Pegas extends Horse {
    public Pegas() throws IOException {
    }

    //Если в задании имени есть "Пегас"/"пегас" - лошадь полетит
    public void fly() {
        if (this.getName().contains("пегас") || this.getName().contains("Пегас")) {
            System.out.println("Полетит\n");
        } else {
            System.out.println("Не полетит\n");
        }
    }
}
