package domain;

import service.Transoprt;
import service.TypeOfVehicle;

public class TransportFabric {
    public static Transoprt createObject(TypeOfVehicle type) {

        Transoprt transoprt = null;
        switch (type) {
            case CAR -> {
                transoprt = new Car();
            }
            case SHIP -> {
                transoprt = new Ship();
            }
            case PLANE -> {
                transoprt = new Plane();
            }
        }
        return transoprt;
    }
}
