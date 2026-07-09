package exercice1;

/*====================================================
  4. HERITAGE
====================================================*/

// Voiture hérite de Vehicule
class Voiture extends Vehicule {

    public Voiture(String matricule,
                   String modele,
                   double niveauCarburant,
                   FuelType fuelType,
                   Moteur moteur) {

        super(matricule, modele, niveauCarburant, fuelType, moteur);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre avec un bouton Start.");
    }
}
