package comportement.mediator;

public class CommercialAirplane extends Airplane {

    public CommercialAirplane(ATCMediator mediator, String callSign) {
        super(mediator, callSign);
    }

    @Override
    public void receive(String message) {
        System.out.println("[Vol commercial " + callSign + "] Reçu : " + message);
    }
}
