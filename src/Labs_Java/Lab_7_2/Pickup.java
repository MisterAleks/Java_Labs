package Labs_Java.Lab_7_2;

import java.util.ArrayList;

/**
 * Created by Алексей on 16.05.2016.
 */
public class Pickup {
    private Truck truck;
    private ArrayList cargo = new ArrayList();

    public Pickup() {
    }

    public void viewWorkload() {
        System.out.println(cargo.toString());
    }

    public void cargoIn(Truck truck) {
        if (truck.getUsageCargoSpace() == 0) {
            System.out.println("Грузовик пустой");
        } else {
            while (truck.getUsageCargoSpace() != 0) {
                cargo.add(truck.getCargo().get(0));
                truck.getCargo().remove(0);
            }
            truck.clearUsageCargoSpace();
        }
    }

    public void cargoOut(Truck truck) {
        if (cargo.size() > truck.getCargoSpace()) {
            System.out.println("Машина столько в себе не поместит");
        } else {
            if (cargo.size() > (truck.getCargoSpace() - truck.getUsageCargoSpace())) {
                System.out.println("Машина может в себе столько поместить, но для начала ее нужно разгрузить");
            } else {
                while (cargo.size() != 0) {
                    truck.getCargo().add(cargo.get(0));
                    cargo.remove(0);
                }
            }
        }
    }
}
