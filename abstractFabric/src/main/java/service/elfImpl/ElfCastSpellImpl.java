package service.elfImpl;


import service.CastSpellService;

public class ElfCastSpellImpl implements CastSpellService {
    @Override
    public void doSpell() {
        System.out.println("Elf shrinked");
    }
}
