package comportement.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements ATCMediator {

    private final List<Airplane> airplanes = new ArrayList<>();

    @Override
    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public void sendMessage(String message, Airplane sender) {
        for (Airplane airplane : airplanes) {
            if (airplane != sender) {
                airplane.receive(message);
            }
        }
    }
}
