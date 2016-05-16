package Labs_Java.Lab_7_2;

/**
 * Created by Алексей on 16.05.2016.
 */
public class Snake extends Pet {
    public Snake(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public void voice() {
        System.out.println("Тсс-ц-ц!");
    }
}
