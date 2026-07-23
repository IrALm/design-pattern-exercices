package comportement.mediator;

public interface ATCMediator {

    void registerAirplane(Airplane airplane);

    void sendMessage(String message, Airplane sender);
}
