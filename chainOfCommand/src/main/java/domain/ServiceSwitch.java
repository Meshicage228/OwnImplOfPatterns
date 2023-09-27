package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import service.Service;

@AllArgsConstructor
@Getter
@Setter
public class ServiceSwitch {
    private Service service;
    private boolean isReady;
}
