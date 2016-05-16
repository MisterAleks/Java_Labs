package Labs_Java.Lab_7_2;

/**
 * Created by Алексей on 16.05.2016.
 */
public interface PassengersAuto {
    public void passengerIn(String passenger);
    public void passengerOut(String passenger);
    public void moveTo(String destination, int distance);
}
