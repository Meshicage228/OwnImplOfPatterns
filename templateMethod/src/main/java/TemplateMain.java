import domain.Car;
import service.impl.AlexAsDriver;
import service.impl.VladAsDriver;
public class TemplateMain {
    public static void main(String[] args) {
        Car car = new Car(new VladAsDriver());
        car.carStatistics();

        car.changeBehaviour(new AlexAsDriver());
        car.carStatistics();
    }
}
