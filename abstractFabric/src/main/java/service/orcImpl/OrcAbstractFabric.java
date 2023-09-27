package service.orcImpl;


import service.CastSpellService;
import service.CommunicationService;
import service.CreatureAbstractFactory;
import service.MoveService;

public class OrcAbstractFabric implements CreatureAbstractFactory {
    @Override
    public CastSpellService castSpell() {
        return new OrcCastSpellImpl();
    }

    @Override
    public CommunicationService communicate() {
        return new OrcCommunicationImpl();
    }

    @Override
    public MoveService moves() {
        return new OrcMoveImpl();
    }
}
