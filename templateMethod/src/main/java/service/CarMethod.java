package service;

public abstract class CarMethod {
    protected abstract float showSpeed();

    protected abstract String carDriver();

    protected abstract String changeMusic(String name);

    public final void carCondition(){
        var carDriver = carDriver();
        System.out.println("Current speed : " + showSpeed());
        System.out.println("domain.Car driver now : " + carDriver);
        System.out.println(changeMusic(carDriver));
    }
}
