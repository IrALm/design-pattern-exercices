package comportement.observer;

public class Main {

    public static void main(String[] args) {
        StationMeteo station = new StationMeteo();

        Observateur conditionsActuelles = new AfficheurConditionsActuelles();
        Observateur statistiques = new AfficheurStatistiques();
        Observateur previsions = new AfficheurPrevisions();

        station.abonner(conditionsActuelles);
        station.abonner(statistiques);
        station.abonner(previsions);

        System.out.println("=== Première mesure (3 abonnés) ===");
        station.setMesures(22.5, 60, 1013);

        System.out.println();
        System.out.println("=== Deuxième mesure (3 abonnés) ===");
        station.setMesures(24.0, 55, 1009);

        System.out.println();
        System.out.println("-- Désabonnement dynamique des prévisions --");
        station.desabonner(previsions);

        System.out.println();
        System.out.println("=== Troisième mesure (2 abonnés restants) ===");
        station.setMesures(19.0, 70, 1015);
    }
}
