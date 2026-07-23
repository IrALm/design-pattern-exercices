package comportement.mediator;

public class CargoAirplane extends Airplane {

    public CargoAirplane(ATCMediator mediator, String callSign) {
        super(mediator, callSign);
    }

    @Override
    public void receive(String message) {
        System.out.println("[Vol cargo " + callSign + "] Reçu : " + message);
    }
}
