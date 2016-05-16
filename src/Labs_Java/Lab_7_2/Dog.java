package Labs_Java.Lab_7_2;

/**
 * Created by Алексей on 16.05.2016.
 */
public class Dog extends Pet {
    public Dog(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public void voice() {
        System.out.println("Гав!");
    }
}
