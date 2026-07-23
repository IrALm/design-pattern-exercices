package comportement.observer;

public class AfficheurStatistiques implements Observateur {

    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;
    private double somme;
    private int nombreMesures;

    @Override
    public void actualiser(double temperature, double humidite, double pression) {
        min = Math.min(min, temperature);
        max = Math.max(max, temperature);
        somme += temperature;
        nombreMesures++;

        double moyenne = somme / nombreMesures;
        System.out.println("[Statistiques] Température min : " + min + "°C, max : " + max
                + "°C, moyenne : " + moyenne + "°C (sur " + nombreMesures + " mesures).");
    }
}
