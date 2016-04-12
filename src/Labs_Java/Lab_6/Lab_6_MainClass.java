package Labs_Java.Lab_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 21.03.2016.
 * 1. Написать два класса: Horse(лошадь) - в конструкторе задается кличка лошади и Pegas(пегас) - релизующий
 * метод полет(сообщает какая лошадь летит). Унаследовать пегаса от лошади.
 * <p/>
 * 2. Написать три класса: Pet(домашнее животное) - с полями вес, пол, возраст,
 * Cat(кот) с полем имя и Dog(собака) с полем имя. Унаследовать кота и собаку от животного.
 * В классах кот и собака реализовать методы вывода информации и о животных
 * <p/>
 * 3. Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human(Человек).
 * Унаследовать животных от рыб, обезьян от животных и человека от обезьян.
 * Поля и методы разработать самостоятельно.
 * <p/>
 * 4. Скрыть все внутренние переменные класса Cat, добавить методы работы с этими переменными
 */

//ЗАДАНИЕ №1
class Horse {
    public String horseName;

    public Horse() throws IOException {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите имя лошади: ");
            horseName = in.readLine();
        } catch (Exception e) {
            System.out.println("Ошибка ввода. Переименовано: Лошадь");
            horseName = "Лошадь";
        }
    }
}

class Pegas extends Horse {
    public Pegas() throws IOException {
    }

    boolean isPegas() {
        if (horseName.equals("Пегас")) {
            return true;
        } else {
            return false;
        }
    }
}

//ЗАДАНИЕ №2
class Pet {
    //Вес
    public int weight;

    //Пол
    public String gender;

    //Возраст
    public int old;

}

class Dog extends Pet {
    public String name;

    public Dog() throws IOException {
        while (true) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Введите имя собаки: ");
                name = in.readLine();

                System.out.print("Введите вес: ");
                weight = Integer.parseInt(in.readLine());

                System.out.print("Введите возраст: ");
                old = Integer.parseInt(in.readLine());

                System.out.print("Введите пол: ");
                gender = in.readLine();

                System.out.println("\n");
                break;
            } catch (Exception e) {
                System.out.println("Ошибка, неккоректный ввод. Попробуйте еще раз\n");
            }
        }
    }

    public void getStat() {
        System.out.println("Имя - " + this.name);
        System.out.println("Пол - " + this.gender);
        System.out.println("Возраст - " + this.old);
        System.out.println("Вес - " + this.weight + "\n");
    }
}

//ЗАДАНИЕ №4
class Cat extends Pet {
    private String name;

    public Cat() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите имя кота(кошки): ");
        name = in.readLine();

        while (true) {
            try {
                System.out.print("Введите вес: ");
                weight = Integer.parseInt(in.readLine());

                System.out.print("Введите возраст: ");
                old = Integer.parseInt(in.readLine());

                break;
            } catch (Exception e) {
                System.out.println("Ошибка, неккоректный ввод. Попробуйте еще раз\n");
            }
        }

        System.out.print("Введите пол: ");
        gender = in.readLine();

        System.out.println("\n");
    }

    public void getStat() {
        System.out.println("Имя - " + this.name);
        System.out.println("Пол - " + this.gender);
        System.out.println("Возраст - " + this.old);
        System.out.println("Вес - " + this.weight + "\n");
    }
}

//ЗАДАНИЕ №3
class Fish {
    //Сделаем что-то общее для 4 классов, постепенно доходя до чедовека
    //Сначала возраст. Например, рыба и человек имеют такой параметр, как возраст
    private int old;

    public Fish() throws IOException {
        createFish();
    }

    private void createFish() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст: ");

        while (true) {
            try {
                old = Integer.parseInt(in.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз");
            }
        }
    }

    public void getOld() throws IOException {
        System.out.print(old);
    }
}

class Animal extends Fish {
    //Добавим пол
    private String gender;

    public Animal() throws IOException {
        createAnimal();
    }

    private void createAnimal() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите пол: ");
        gender = in.readLine();
    }

    public void getGender() throws IOException {
        System.out.print(gender);
    }
}

class Ape extends Animal {
    //Добавим имя
    private String name;

    public Ape() throws IOException {
        createApe();
    }

    private void createApe() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        name = in.readLine();
    }

    public void getName() throws IOException {
        System.out.print(name);
    }
}

class Human extends Ape {
    //При создании объекта данного класса сначала унаследуются все предыдущие конструкторы
    //Они предложат ввести свои параметры и только потом задействуется конструктор данного класса
    public Human() throws IOException {
        System.out.println("Человек и его унаследованные свойства:");
        System.out.print("Рыба - возраст: ");
        getOld();
        System.out.print("\nЖивотное - пол: ");
        getGender();
        System.out.print("\nОбезьяна - имя: ");
        getName();
    }
}

public class Lab_6_MainClass {
    public static void main(String[] args) throws IOException {
        //ЗАДАНИЕ №1
        Pegas peggi = new Pegas();

        if (peggi.isPegas()) {
            System.out.println("Полетит");
        } else {
            System.out.println("Не полетит");
        }

        //ЗАДАНИЕ №2
        Cat barsik = new Cat();
        Dog sharik = new Dog();

        barsik.getStat();
        sharik.getStat();

        //ЗАДАНИЕ №3
        Human human = new Human();
    }
}
