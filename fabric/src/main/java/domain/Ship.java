package domain;

import service.Transoprt;

public class Ship implements Transoprt {
    @Override
    public void doDeliver() {
        System.out.println("Delivers by sea");
    }
}
