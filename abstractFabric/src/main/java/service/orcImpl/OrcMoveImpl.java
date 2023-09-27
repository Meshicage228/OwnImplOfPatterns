package service.orcImpl;


import service.MoveService;

public class OrcMoveImpl implements MoveService {
    @Override
    public void makeStep() {
        System.out.println("Orc very slow");
    }
}
