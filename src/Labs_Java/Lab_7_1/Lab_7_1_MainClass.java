package Labs_Java.Lab_7_1;

/**
 * Created by Алексей on 13.04.2016.
 * <p/>
 * <p/>
 * ЗАДАЧИ НА ПОЛИМОРФИЗМ
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
 * ЗАДАЧИ НА ПЕРЕГРУЗКУ МЕТОДОВ
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
 */

public class Lab_7_1_MainClass {
    static void checkObject(Object o) {
        while (true) {
            if (o instanceof Cat) {
                try {
                    o = (Dog) o;
                    System.out.println("Собака");
                    break;
                } catch (Exception error) {
                    System.out.println("Кошка");
                    break;
                }
            }
            if (o instanceof Bird) {
                System.out.println("Птица");
                break;
            }
            if (o instanceof Lamp) {
                System.out.println("Лампа");
                break;
            }
            System.out.println("Неизвестный объект");
            break;
        }
    }

    public static void main(String[] args) {
        //Полиморфизм. Задание №1
        Whale whale = new Whale();
        whale.printName();
        System.out.println();

        //Полиморфизм. Задание №2
        Dog dog = new Dog();
        Lamp lamp = new Lamp();
        checkObject(dog);
        checkObject(lamp);
        System.out.println();

        //Полиморфизм. Задание №3
        Cat cat = new Cat("Мурзик");
        Dog dog1 = new Dog("Шарик");
        Cat catChild1 = cat.getChild();
        Cat catChild2 = cat.getChild();
        Dog dogChild = dog1.getChild();
        System.out.println(catChild1.name);
        System.out.println(catChild2.name);
        System.out.println(dogChild.name);
        System.out.println();

        //Перегрузка. Задание №1
        int i = 5;
        String s = "Это строка";
        Print.print(i);
        Print.print(s);
        System.out.println();

        //Перегрузка. Задание №2
        Integer in = 4;
        Print.print(in);
        System.out.println();

        //Перегрузка. Задание №3
        Double d = 3.14;
        Print.print(d);
        int[] mass = new int[]{1, 2, 3, 4, 5};
        Print.print(mass);
        System.out.println();

        //Перегрузка. Задание №4
        int i1 = 2, i2 = 3;
        long l1 = 4, l2 = 5;
        double d1 = 2.25, d2 = 15.41;
        System.out.println(MinMax.min(i1, i2));
        System.out.println(MinMax.min(l1, l2));
        System.out.println(MinMax.min(d1,d2));
        System.out.println();

        //Перегрузка. Задание №5
        System.out.println(MinMax.max(i1,i2));
        System.out.println(MinMax.max(l1,l2));
        System.out.println(MinMax.max(d1,d2));
        System.out.println();
    }
}
