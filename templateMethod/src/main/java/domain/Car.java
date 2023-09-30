package domain;

import lombok.AllArgsConstructor;
import service.CarMethod;
@AllArgsConstructor
public class Car {
    private CarMethod carMethod;

    public void carStatistics(){
        carMethod.carCondition();
    }
    public void changeBehaviour(CarMethod carMethodNew){
        carMethod = carMethodNew;
    }
}
