package Labs_Java.Lab_7_2;

import java.util.ArrayList;

/**
 * Created by Алексей on 16.05.2016.
 */
public class Pickup {
    private Truck truck;
    private ArrayList cargoList = new ArrayList();

    public Pickup() {
    }

    public void viewWorkload() {
        System.out.println("Груз: " + cargoList.toString());
    }

    public void cargoIn(Truck truck) {
        if (truck.getUsageCargoSpace() == 0) {
            System.out.println("Грузовик пустой");
        } else {
            while (truck.getCargoList().size() != 0) {
                String s = (String) truck.getCargoList().get(0);
                cargoList.add(s);
                truck.getCargoList().remove(0);
            }
            truck.clearUsageCargoSpace();
        }
    }

    public void cargoOut(Truck truck) {
        if (cargoList.size() > truck.getCargoSpace()) {
            System.out.println("Машина столько в себе не поместит");
        } else {
            if (cargoList.size() > (truck.getCargoSpace() - truck.getUsageCargoSpace())) {
                System.out.println("Машина может в себе столько поместить, но для начала ее нужно разгрузить");
            } else {
                int a = cargoList.size();
                while (cargoList.size() != 0) {
                    truck.getCargoList().add(cargoList.get(0));
                    cargoList.remove(0);
                }
                truck.setUsageCargoSpace(a);
            }
        }
    }
}
