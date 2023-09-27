package service.elfImpl;


import service.CastSpellService;
import service.CommunicationService;
import service.CreatureAbstractFactory;
import service.MoveService;

public class ElfAbstractFabric implements CreatureAbstractFactory {
    @Override
    public CastSpellService castSpell() {
        return new ElfCastSpellImpl();
    }

    @Override
    public CommunicationService communicate() {
        return new ElfCommunicationImpl();
    }

    @Override
    public MoveService moves() {
        return new ElfMoveImpl();
    }
}
