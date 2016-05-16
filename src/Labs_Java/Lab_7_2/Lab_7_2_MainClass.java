package Labs_Java.Lab_7_2;

/**
 * Created by Алексей on 16.05.2016.
 * <p/>
 * <p/>
 * ЗАДАЧИ НА АБСТРАКТНЫЕ КЛАССЫ
 * <p/>
 * 1. Сделать класс Pet (Лабораторная №6) абстрактным.
 * <p/>
 * 2.	Создать абстрактный класс Pet с полями name, age, hungry(хочет есть) и абстрактный метод voice(голос).
 * Создать классы Snake, Dog, PatrolDog, Cat, Fish и наследники класса Pet. В каждом классе реализовать метод voice.
 * <p/>
 * <p/>
 * ЗАДАЧИ НА ИНТЕРФЕЙСЫ
 * <p/>
 * Реализовать два интерфейса PassengersAuto (описать метод перевозки пассажиров) и CargoAuto (описать метод
 * перевозки груза). Написать классы Truck, Sedan, Pickup, реализующие эти интерфейсы.
 */
public class Lab_7_2_MainClass {
    public static void main(String[] args) {
        //Абстрактные классы. Задание №1
        System.out.println("Проверьте файл Pet со всеми классами в лабораторной №6\n");

        //Задание №2.
        Snake snake = new Snake("Змея", 10, true);
        Dog dog = new Dog("Собака", 11, false);
        PatrolDog patrolDog = new PatrolDog("Патрульная собака", 12, true);
        Cat cat = new Cat("Кошка", 13, false);
        Fish fish = new Fish("Рыба", 14, true);
        System.out.println();

        System.out.println(snake.getName());
        snake.voice();
        System.out.println();

        System.out.println(dog.getName());
        dog.voice();
        System.out.println();

        System.out.println(patrolDog.getName());
        patrolDog.voice();
        System.out.println();

        System.out.println(cat.getName());
        cat.voice();
        System.out.println();

        System.out.println(fish.getName());
        fish.voice();
        System.out.println();

        //Интерфейсы
        //Truck - грузовик. Грузоподьемность и посадочные места задаются вручную. Топлива - 20 единиц
        //Sedan - легковая машина. Посадочные места задаются вручную. Негрузоподъемна. Топлива - 40 единиц
        //Pickup - погрузчик. Сгружает все с грузовой машины за раз в "себя" (или загружает машину)
        Truck truck = new Truck(2, 10);
        Sedan sedan = new Sedan(5);
        Pickup pickup = new Pickup();

        truck.passengerOut("Вася");

        truck.passengerIn("Вася");
        truck.passengerIn("Петя");

        truck.passengerIn("Коля");

        truck.cargoIn("Древесина");
        truck.cargoIn("Кирпичи");
        truck.viewWorkload();

        truck.moveTo("Мытищи", 21);
        System.out.println();

        sedan.passengerOut("Вася");

        sedan.passengerIn("Вася");
        sedan.viewWorkload();

        sedan.moveTo("Мытищи", 21);
        System.out.println();

        pickup.cargoIn(truck);
        pickup.viewWorkload();
        System.out.println();
    }
}
