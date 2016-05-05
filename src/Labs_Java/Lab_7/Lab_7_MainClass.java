package Labs_Java.Lab_7;

import java.io.IOException;

/**
 * Created by Алексей on 13.04.2016.
 * <p/>
 * <p/>
 * Задачи на полиморфизм
 * <p/>
 * 1.   Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала: Я не корова, Я – кит.
 * <p/>
 * 2.	Написать метод, который определяет, объект какого класса ему передали,
 * и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 * <p/>
 * 3.	Создать два класса Cat(кот) и Dog(собака), класс Dog(собака) происходит от Cat(кот).
 * Определить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
 * <p/>
 * <p/>
 * Задачи на перегрузку методов
 * <p/>
 * 1.	Написать два метода: print(int) и print(String).
 * <p/>
 * 2.	Написать два метода: print(int) и print(Integer).Написать такой код в методе main, чтобы вызвались они оба.
 * <p/>
 * 3.	Написать пять методов print с разными параметрами.
 * <p/>
 * 4.	Написать public static методы: int min(int, int), long min(long, long),
 * double min(double, double). Каждый метод должен возвращать минимальное из двух переданных в него чисел.
 * <p/>
 * 5.	Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
 * Каждый метод должен возвращать максимальное из двух переданных в него чисел.
 * <p/>
 * <p/>
 * Задача на интерфейсы
 * <p/>
 *      Реализовать два интерфейса PassangersAuto(описать метод перевозки пассажиров)
 * и CargoAuto (описать метод перевозки груза). Написать классы Truck, Sedan, Pickup реализующие эти интерфейсы
 */

class Cow {
    public void printAll() {
        printName();
        printColor();
    }

    public void printName() {
        System.out.println("Я - корова");
    }

    public void printColor() {
        System.out.println("Я - белая");
    }
}

//ЗАДАНИЕ №1. Переопределение метода
class Whale extends Cow {
    public void printName() {
        System.out.println("Я не корова, я - кит");
    }
}

//ЗАДАНИЕ №2. Классы
//ЗАДАНИЕ №3. Переопределение методов
class Cat {
    private String name;

    //!!!
    //Допустим, что кошка (далее и собака) имеют максимум по пять детей (это ограничено массивом childs)
    //Для проверки создадим приватное поле "количество детей"
    //Если оно достигнет максимума (длины массива childs) - метод getChild() больше "не будет создавать детей"
    private int countChilds;

    //Для возврата объектов типа "ребенок" их нужно где-либо хранить
    //Для этого объявим публичный массив объектов типа Cat, в котором удобно их будет и возвращать
    public Cat[] childs = new Cat[5];

    //Стандартный конструктор. Задан явно, поскольку при наличии нескольких конструкторов,
    //конструктор без параметров больше не создается автоматически
    public Cat(){
        name = "Кот";
    }

    public Cat(String newName) throws IOException{
        name = newName;
    }

    public String getName() {
        return name;
    }

    //TODO
    public void getChild(String newName){
        childs[countChilds] = new Cat();
        childs[countChilds].name = newName;
        countChilds++;
    }
}

class Dog extends Cat {
    //TODO
}

class Bird {
}

class Lamp {
}

public class Lab_7_MainClass {
    //ЗАДАНИЕ №2. Метод определения класса
    public static void check(Object a) {
        if (a instanceof Cat) {
            System.out.println("Кошка");
        } else if (a instanceof Dog) {
            System.out.println("Собака");
        } else if (a instanceof Bird) {
            System.out.println("Птица");
        } else if (a instanceof Lamp) {
            System.out.println("Лампа");
        } else
            System.out.println("Неопределенный тип");
    }

    public static void main(String[] args) {
        //ЗАДАНИЕ №1
        Whale whale = new Whale();
        whale.printName();

        //ЗАДАНИЕ №2
        Dog myObject = new Dog();
        check(myObject);

        //ЗАДАНИЕ №3

    }
}
