package Labs_Java.Lab_7_2;

import java.util.ArrayList;

/**
 * Created by Алексей on 16.05.2016.
 */
public class Truck extends Sedan implements PassengersAuto, CargoAuto {
    //Количество мест для груза + загруженность
    private int cargoSpace;
    private int usageCargoSpace = 0;
    private ArrayList cargo = new ArrayList();

    //Для Pickup (подъемника)
    public int getCargoSpace() {
        return cargoSpace;
    }

    public int getUsageCargoSpace() {
        return usageCargoSpace;
    }

    public void clearUsageCargoSpace() {
        usageCargoSpace = 0;
    }

    public ArrayList getCargo() {
        return cargo;
    }

    //Количество топлива
    private int fuel = 20;

    //Посмотреть загруженность машины
    public void viewWorkload() {
        super.viewWorkload();
        System.out.println("Груз: " + cargo.toString());
    }

    public Truck(int seatings, int cargoSpace) {
        super(seatings);
        this.cargoSpace = cargoSpace;
    }

    public void refill() {
        fuel = 20;
    }

    public void cargoIn(String cargo) {
        if (usageCargoSpace < cargoSpace) {
            usageCargoSpace++;
            this.cargo.add(cargo);
        } else {
            System.out.println("Грузить уже некуда ваше " + cargo);
        }
    }

    public void cargoOut(String cargo) {
        if (usageCargoSpace != 0) {
            usageCargoSpace--;
            this.cargo.remove(cargo);
        } else {
            System.out.println("Нечего сгружать, загружать надо");
        }
    }

    //Особенность: метод moveTo есть в обоих интерфейсах. Здесь его достаточно привести один раз
    //Да и два раза не получтся, так как он имеет одинаковое название и параметры
    public void moveTo(String destination, int distance) {
        if (distance > 20) {
            System.out.println("Поездка невозможна. Слишком далеко");
        } else {
            if (fuel < distance) {
                System.out.println("До " + destination + " не доедем. Не хватает " + (distance - fuel) +
                        " единиц бензина. Дозаправтесь перед поездкой");
            } else {
                fuel -= distance;
                System.out.println("К месту назначения " + destination + " успешно прибыли. Осталось " + fuel +
                        " единиц бензина");
            }
        }
    }
}
