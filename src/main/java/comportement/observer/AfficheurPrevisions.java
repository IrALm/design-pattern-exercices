package comportement.observer;

public class AfficheurPrevisions implements Observateur {

    private double pressionPrecedente;
    private boolean premiereMesure = true;

    @Override
    public void actualiser(double temperature, double humidite, double pression) {
        String prevision;
        if (premiereMesure) {
            prevision = "Données insuffisantes pour prévoir.";
            premiereMesure = false;
        } else if (pression > pressionPrecedente) {
            prevision = "Amélioration du temps en vue.";
        } else if (pression < pressionPrecedente) {
            prevision = "Risque de dégradation du temps.";
        } else {
            prevision = "Temps stable.";
        }

        pressionPrecedente = pression;
        System.out.println("[Prévisions] " + prevision);
    }
}
