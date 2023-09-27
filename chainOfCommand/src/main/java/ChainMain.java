import service.Service;
import service.impl.AnsweringMachine;
import service.impl.LogServiceImpl;
import util.ChainService;

public class ChainMain {
    public static void main(String[] args) {
        ChainService chainService = new ChainService();

        Service answeringMachine = new AnsweringMachine(chainService);
        Service logService1 = new LogServiceImpl(chainService);
        Service  answeringMachine1 = new AnsweringMachine(chainService);
        Service  answeringMachine2 = new AnsweringMachine(chainService);

        Service logService = new LogServiceImpl(chainService);

        logService1.doChain(chainService);
    }
}
