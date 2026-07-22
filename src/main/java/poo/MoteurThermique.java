package poo;

// Moteur thermique
class MoteurThermique implements Moteur {

    @Override
    public double calculerAutonomie(double niveauCarburant) {
        return niveauCarburant * 15;
    }
}
