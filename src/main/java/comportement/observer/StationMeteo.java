package comportement.observer;

import java.util.ArrayList;
import java.util.List;

public class StationMeteo implements Sujet {

    private final List<Observateur> observateurs = new ArrayList<>();

    private double temperature;
    private double humidite;
    private double pression;

    @Override
    public void abonner(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void desabonner(Observateur observateur) {
        observateurs.remove(observateur);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualiser(temperature, humidite, pression);
        }
    }

    // Point d'entrée unique des nouvelles mesures : la station ne connaît
    // aucun détail des modules d'affichage, elle notifie juste l'interface.
    public void setMesures(double temperature, double humidite, double pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        notifierObservateurs();
    }
}
