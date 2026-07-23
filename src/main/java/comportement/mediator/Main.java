package comportement.mediator;

public class Main {

    public static void main(String[] args) {
        ControlTower tour = new ControlTower();

        Airplane vol1 = new CommercialAirplane(tour, "AF-123");
        Airplane vol2 = new CommercialAirplane(tour, "AF-456");
        Airplane cargo = new CargoAirplane(tour, "FX-789");

        tour.registerAirplane(vol1);
        tour.registerAirplane(vol2);
        tour.registerAirplane(cargo);

        System.out.println("-- " + "AF-123" + " envoie une demande d'atterrissage --");
        vol1.send("Demande d'autorisation d'atterrissage sur la piste 1.");
    }
}
