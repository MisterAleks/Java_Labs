package Labs_Java.Lab_7_2;

/**
 * Created by Алексей on 16.05.2016.
 */
public abstract class Pet {
    private String name;
    private int age;
    private boolean hungry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public abstract void voice();
}
