package domain;

import service.Transoprt;

public class Plane implements Transoprt {
    @Override
    public void doDeliver() {
        System.out.println("Delivers by air");
    }
}
