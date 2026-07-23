package comportement.observer;

public interface Sujet {

    void abonner(Observateur observateur);

    void desabonner(Observateur observateur);

    void notifierObservateurs();
}
