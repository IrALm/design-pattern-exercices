package exercice1;

// Moteur électrique
class MoteurElectrique implements Moteur {

    @Override
    public double calculerAutonomie(double niveauCarburant) {
        return niveauCarburant * 8;
    }
}
