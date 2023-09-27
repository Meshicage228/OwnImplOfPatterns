package service.impl;

import service.Service;
import util.ChainService;

public class LogServiceImpl implements Service {
    public LogServiceImpl(ChainService chainService) {
        chainService.addService(this);
    }

    @Override
    public void doChain(ChainService chainService) {
        System.out.println("Logging...");
        chainService.next(this);
    }
}
