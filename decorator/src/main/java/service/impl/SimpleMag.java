package service.impl;

import service.Magician;

public class SimpleMag implements Magician {
    @Override
    public void attack() {
        System.out.println("service.Magician attacks you!");
    }

    @Override
    public void showPossibilities() {
        System.out.println("Can cast : fireball");
    }

    @Override
    public void castSpell() {
        System.out.println("Casts fireball");
    }
}
