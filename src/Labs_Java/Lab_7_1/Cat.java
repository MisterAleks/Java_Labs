package Labs_Java.Lab_7_1;

/**
 * Created by Алексей on 13.05.2016.
 */
public class Cat {
    public String name;
    public int childCount = 0;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
        this.name = "Кошка родитель";
    }

    public Cat getChild() {
        childCount++;
        String name = this.name + ": " + childCount + "ребенок";
        return (new Cat(name));
    }
}
