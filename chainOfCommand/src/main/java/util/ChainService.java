package util;

import domain.ServiceSwitch;
import service.Service;

import java.util.ArrayList;
import java.util.List;

public class ChainService {
    private List<ServiceSwitch> clients = new ArrayList<>();
    public void next(Service service){
        clients.stream()
                .filter(serviceSwitch -> serviceSwitch.getService() == service)
                .forEach(serviceSwitch -> serviceSwitch.setReady(false));

       clients.stream()
                .filter(ServiceSwitch::isReady)
                .map(ServiceSwitch::getService)
                .findFirst()
                .ifPresent(service1 -> service1.doChain(this));



    }
    public void addService(Service service){
        clients.add(new ServiceSwitch(service, true));
    }
}
