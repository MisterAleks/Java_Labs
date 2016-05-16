package Labs_Java.Lab_7_2;

import java.util.ArrayList;

/**
 * Created by Алексей on 16.05.2016.
 */
public class Sedan implements PassengersAuto {
    //Количество посадочных мест для пассажиров + количество занятых мест
    private int seatings;
    private int usageSeatings = 0;
    private ArrayList passengersList = new ArrayList();

    //Количество топлива
    private int fuel = 40;

    //Посмотреть загруженность машины
    public void viewWorkload() {
        System.out.println("Пассажиры: " + passengersList.toString());
        System.out.println("Топлива: " + fuel);
    }

    public Sedan(int seatings) {
        this.seatings = seatings;
    }

    public void refill() {
        fuel = 40;
    }

    public void passengerIn(String passenger) {
        if (usageSeatings < seatings) {
            usageSeatings++;
            passengersList.add(passenger);
        } else {
            System.out.println("Машина забита, мест нет для " + passenger);
        }
    }

    public void passengerOut(String passenger) {
        if (usageSeatings != 0) {
            usageSeatings--;
            try {
                passengersList.remove(passenger);
            } catch (Exception error) {
                System.out.println("Ошибка индекса листа");
            }
        } else {
            System.out.println("Ну и кого высаживать? Машина пустая");
        }
    }

    //Особенность: метод moveTo есть в обоих интерфейсах. Здесь его достаточно привести один раз
    //Да и два раза не получтся, так как он имеет одинаковое название и параметры
    public void moveTo(String destination, int distance) {
        if (distance > 40) {
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
