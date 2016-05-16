package Labs_Java.Lab_7_2;

/**
 * Created by Алексей on 16.05.2016.
 */
public interface CargoAuto {
    public void cargoIn(String cargo);
    public void cargoOut(String cargo);
    public void moveTo(String destination, int distance);
}
