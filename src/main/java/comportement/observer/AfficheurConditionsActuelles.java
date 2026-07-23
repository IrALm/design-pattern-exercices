package comportement.observer;

public class AfficheurConditionsActuelles implements Observateur {

    @Override
    public void actualiser(double temperature, double humidite, double pression) {
        System.out.println("[Conditions actuelles] Température : " + temperature
                + "°C, Humidité : " + humidite + "%, Pression : " + pression + " hPa.");
    }
}
