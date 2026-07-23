package comportement.mediator;

public abstract class Airplane {

    protected ATCMediator mediator;
    protected String callSign;

    protected Airplane(ATCMediator mediator, String callSign) {
        this.mediator = mediator;
        this.callSign = callSign;
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public abstract void receive(String message);
}
