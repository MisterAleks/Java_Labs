package Labs_Java.Lab_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Алексей on 11.05.2016.
 */
public class Animal {
    private int power;

    public int getPower() {
        return power;
    }

    public Animal() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("\nВведите силу");
                power = Integer.parseInt(in.readLine());
                break;
            } catch (Exception error) {
                System.out.println("Некорректный ввод");
            }
        }
    }
}

class Fish extends Animal {
    //Съедобность рыбы
    private boolean edibility;

    public Fish() {
        super();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int check_fish;

        while (true) {
            try {
                System.out.println("\nВведите съедобность рыбы: 1 - съедобная, 0 - несъедобная:");
                check_fish = Integer.parseInt(in.readLine());
                if (check_fish == 0) {
                    edibility = false;
                    break;
                }
                if (check_fish == 1) {
                    edibility = true;
                    break;
                }
                System.out.println("Неккоректный ввод");
            } catch (Exception error) {
                System.out.println("Неккоректный ввод");
            }
        }
    }

    public boolean isEdibility() {
        return edibility;
    }
}

class Ape extends Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public Ape() {
        super();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("\nВведите возраст");
                age = Integer.parseInt(in.readLine());
                break;
            } catch (Exception error) {
                System.out.println("Неккоректный ввод");
            }
        }
    }
}

class Human extends Ape {
    public Human() {
        super();
    }

    //Взаимодействие:
    //Рыба - рыбалка, Животное - охота, Обезьяна - обучение

    public void interaction(Fish fish) {
        if (fish.isEdibility()) {
            if (this.getPower() > fish.getPower()) {
                System.out.println("Рыба удачно поймана");
            } else {
                System.out.println("Рыба слишком велика");
            }
        } else {
            System.out.println("Рыба несъедобна");
        }
    }

    public void interaction(Animal animal) {
        if (this.getPower() > animal.getPower()) {
            System.out.println("Животное добыто на охоте");
        } else {
            System.out.println("Животное опасно, невозможно добыть");
        }
    }

    public void interaction(Ape ape) {
        if (this.getPower() > ape.getPower()) {

            //Допустим, что обезьяны обучаемы только в возрасте от 5 до 18 лет
            if (5 <= ape.getAge() && ape.getAge() <= 18) {
                System.out.println("Обезьяну можно обучить");
            } else {
                System.out.println("Обезьяна необучаема");
            }
        } else {
            System.out.println("Человек слабее обезьяны и не сможет ее обучать");
        }
    }
}