package service.impl;

import service.CarMethod;

public class AlexAsDriver extends CarMethod {
    @Override
    protected float showSpeed() {
        return 90.3f;
    }

    @Override
    protected String carDriver() {
        return "Alex as driver";
    }

    @Override
    protected String changeMusic(String name) {
        return "Rammstein : 'Muter'";
    }
}
