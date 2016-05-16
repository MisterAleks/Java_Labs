package Labs_Java.Lab_7_1;

/**
 * Created by Алексей on 13.05.2016.
 */
public class Dog extends Cat {
    //??
    //Конструкторы не наследуются! ???
    //Без них ошибка в main на попытку создать собаку
    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
        this.name = "Собака родитель";
    }

    public Dog getChild() {
        childCount++;
        String name = this.name + ": " + childCount + "ребенок";
        return (new Dog(name));
    }
}
