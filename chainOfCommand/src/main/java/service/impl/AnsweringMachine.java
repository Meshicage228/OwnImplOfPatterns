package service.impl;

import service.Service;
import util.ChainService;

public class AnsweringMachine implements Service {
    public AnsweringMachine(ChainService chainService) {
        chainService.addService(this);
    }

    @Override
    public void doChain(ChainService chainService) {
        System.out.println("Auto response");
        chainService.next(this);
    }
}
