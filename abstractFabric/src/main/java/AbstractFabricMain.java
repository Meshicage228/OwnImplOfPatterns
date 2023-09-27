import service.elfImpl.ElfAbstractFabric;
import service.orcImpl.OrcAbstractFabric;
import utils.CreatureProcess;

public class AbstractFabricMain {
    public static void main(String[] args) {
        CreatureProcess.showCreatureInfo(new ElfAbstractFabric());
        CreatureProcess.showCreatureInfo(new OrcAbstractFabric());
    }
}
