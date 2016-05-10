package Labs_Java.Lab_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 11.05.2016.
 * Задание №2
 */

public class Pet {
    private int weight;
    private String gender;
    private int age;

    public String getGender() {
        return this.gender;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    //???
    //Вопрос о параметрах: как правильнее - вводить с параметрами (передавать вес, пол и пр.) в конструктор
    //Или создавать стандартный конструктор без параметров (Как сейчас) и использовать System.in?

    //=> Вопрос - во втором случае где оставлять проверку на корректность вводимых данных?
    //Сильно захламлять main не хочется.

    public Pet() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            //???
            //При вводе не через Scanner как лучше вводить: разбивать строку и искать вхождения или через Enter?
            System.out.println("Введите вес, пол и возраст (через Enter):");

            try {
                weight = Integer.parseInt(in.readLine());
                gender = in.readLine();

                switch (gender) {
                    case "М":
                    case "м":
                    case "Ж":
                    case "ж":
                        break;
                    default:
                        System.out.println("Ошибка: пол вводится одной буквой!\n");
                        continue;
                }

                age = Integer.parseInt(in.readLine());
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Непредвиденная ошибка\n");
            }
        }
    }
}

class Cat extends Pet {
    private String name;

    public Cat() {
        super();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите имя кота/кошки:");

            try {
                name = in.readLine();
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Непредвиденная ошибка, попробуйте еще раз\n");
            }
        }
    }

    public void getStat() {
        System.out.println("\nДанные о коте: вес " + getWeight() + ", пол " + getGender() + ", возраст " + getAge() +
        ", имя " + name);
    }
}

class Dog extends Pet {
    private String name;

    public Dog() {
        super();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите имя собаки:");

            try {
                name = in.readLine();
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Непредвиденная ошибка, попробуйте еще раз\n");
            }
        }
    }

    public void getStat() {
        System.out.println("\nДанные о собаке: вес " + getWeight() + ", пол " + getGender() + ", возраст " + getAge() +
                ", имя " + name);
    }
}
