package exercice1;

/*====================================================
  3. ABSTRACTION ET ENCAPSULATION
====================================================*/

// Classe abstraite : un véhicule générique ne peut pas être instancié
abstract class Vehicule {

    // Encapsulation
    private String matricule;
    private String modele;
    private double niveauCarburant;
    private FuelType fuelType;

    // Composition : un véhicule possède un moteur
    private Moteur moteur;

    public Vehicule(String matricule,
                    String modele,
                    double niveauCarburant,
                    FuelType fuelType,
                    Moteur moteur) {

        this.matricule = matricule;
        this.modele = modele;
        this.niveauCarburant = niveauCarburant;
        this.fuelType = fuelType;
        this.moteur = moteur;
    }

    // Accesseurs (Getters)

    public String getMatricule() {
        return matricule;
    }

    public String getModele() {
        return modele;
    }

    public double getNiveauCarburant() {
        return niveauCarburant;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    // Obtention de l'autonomie grâce au moteur
    public double obtenirAutonomie() {
        return moteur.calculerAutonomie(niveauCarburant);
    }

    // Chaque véhicule démarre différemment
    public abstract void demarrer();
}
