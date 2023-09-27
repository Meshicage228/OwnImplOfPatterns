import domain.TransportFabric;
import service.Transoprt;
import service.TypeOfVehicle;

public class FabricMain {
    public static void main(String[] args) {
        Transoprt car = TransportFabric.createObject(TypeOfVehicle.CAR);
        Transoprt ship = TransportFabric.createObject(TypeOfVehicle.SHIP);
        Transoprt plane = TransportFabric.createObject(TypeOfVehicle.PLANE);

        car.doDeliver();
        ship.doDeliver();
        plane.doDeliver();
    }
}
