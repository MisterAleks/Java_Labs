package Labs_Java.Lab_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 11.05.2016.
 * Задание №2
 */

public abstract class Pet {
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

    public void setGender(String g) {
        gender = g;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public void setAge(int a) {
        age = a;
    }

    //Убран конструктор Pet, поскольку изменен в абстрактный класс
    //Создан метод, заполняющий данные о животном
    public abstract void createPet() throws IOException;
}

class Cat extends Pet {
    private String name;

    public Cat() {
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
        System.out.println("Данные о коте: вес " + getWeight() + ", пол " + getGender() + ", возраст " + getAge() +
                ", имя " + name + "\n");
    }

    public void createPet() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            //Ключевой момент переопределения абстрактного метода:
            //Он практически одинаковый у собаки и кошки, но индивидуально выводится кошка или собака
            //в зависимости от класса, что подчеркивает явное переопределение абстрактного метода
            System.out.println("Введите вес, пол и возраст КОШКИ (через Enter):");

            try {
                setWeight(Integer.parseInt(in.readLine()));
                setGender(in.readLine());

                switch (getGender()) {
                    case "М":
                    case "м":
                    case "Ж":
                    case "ж":
                        break;
                    default:
                        System.out.println("Ошибка: пол вводится одной буквой!\n");
                        continue;
                }

                setAge(Integer.parseInt(in.readLine()));
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Непредвиденная ошибка\n");
            }
        }
    }
}

class Dog extends Pet {
    private String name;

    public Dog() {
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
        System.out.println("Данные о собаке: вес " + getWeight() + ", пол " + getGender() + ", возраст " + getAge() +
                ", имя " + name + "\n");
    }

    public void createPet() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            //Ключевой момент переопределения абстрактного метода:
            //Он практически одинаковый у собаки и кошки, но индивидуально выводится кошка или собака
            //в зависимости от класса, что подчеркивает явное переопределение абстрактного метода
            System.out.println("Введите вес, пол и возраст СОБАКИ (через Enter):");

            try {
                setWeight(Integer.parseInt(in.readLine()));
                setGender(in.readLine());

                switch (getGender()) {
                    case "М":
                    case "м":
                    case "Ж":
                    case "ж":
                        break;
                    default:
                        System.out.println("Ошибка: пол вводится одной буквой!\n");
                        continue;
                }

                setAge(Integer.parseInt(in.readLine()));
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Непредвиденная ошибка\n");
            }
        }
    }
}
