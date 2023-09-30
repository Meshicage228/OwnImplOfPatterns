import service.Magician;
import service.impl.BossMag;
import service.impl.MiddleMag;
import service.impl.SimpleMag;

public class DecoratorMain {
    public static void main(String[] args) {
        Magician magician = new BossMag(new MiddleMag(new SimpleMag()));

        magician.attack();
        magician.showPossibilities();
        magician.castSpell();
    }
}
