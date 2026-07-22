package poo;

// Camion hérite de Vehicule
class Camion extends Vehicule {

    private double capaciteCharge;

    public Camion(String matricule,
                  String modele,
                  double niveauCarburant,
                  FuelType fuelType,
                  Moteur moteur,
                  double capaciteCharge) {

        super(matricule, modele, niveauCarburant, fuelType, moteur);
        this.capaciteCharge = capaciteCharge;
    }

    public double getCapaciteCharge() {
        return capaciteCharge;
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion démarre après préchauffage.");
    }
}
