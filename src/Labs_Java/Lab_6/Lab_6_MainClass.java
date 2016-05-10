package Labs_Java.Lab_6;

import java.io.IOException;

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
 * Унаследовать рыб от животных, обезьян от животных и человека от обезьян.
 * Поля и методы разработать самостоятельно.
 * <p/>
 * 4. Скрыть все внутренние переменные класса Cat, добавить методы работы с этими переменными
 */

public class Lab_6_MainClass {
    public static void main(String[] args) throws IOException {
        //Задание №1
        Pegas pegi = new Pegas();
        pegi.fly();

        //Задание №2

        //???
        //Как избавиться от вызова поясняющей строки ниже, если конструктор родительского класса по умолчанию должен
        //стоять на первом месте и то, что это кошка, понятно только в самом конце?
        System.out.println("Кошка");
        Cat meow = new Cat();
        meow.getStat();

        //Задание №3
        System.out.println("Человек");
        Human human = new Human();

        System.out.println("Обезьяна");
        Ape ape = new Ape();

        System.out.println("Рыба");
        Fish fish = new Fish();

        System.out.println("Животное");
        Animal animal = new Animal();

        human.interaction(animal);
        human.interaction(fish);
        human.interaction(ape);
    }
}
