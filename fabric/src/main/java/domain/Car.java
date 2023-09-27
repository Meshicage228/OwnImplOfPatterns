package domain;

import service.Transoprt;

public class Car implements Transoprt {
    @Override
    public void doDeliver() {
        System.out.println("Delivers by road");
    }
}
