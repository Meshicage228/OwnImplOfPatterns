package service.impl;

import lombok.AllArgsConstructor;
import service.Magician;

@AllArgsConstructor
public class MiddleMag implements Magician {
    private Magician magician;

    @Override
    public void attack() {
        magician.attack();
    }

    @Override
    public void showPossibilities() {
        magician.showPossibilities();
        System.out.println("Can cast firewall");
        System.out.println("Can cast clone");
    }

    @Override
    public void castSpell() {
        magician.castSpell();
        System.out.println("Casts clone");
    }
}
