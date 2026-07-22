package poo;

import java.util.ArrayList;
import java.util.List;

/*====================================================
  EXERCICE 1 : POO de base
  (Encapsulation, Héritage, Abstraction, Composition,
  Polymorphisme)
====================================================*/

/*====================================================
  5. POLYMORPHISME (TEST)
====================================================*/

public class Main {

    public static void main(String[] args) {

        // Liste polymorphique de véhicules
        List<Vehicule> flotte = new ArrayList<>();

        // Voiture électrique
        flotte.add(new Voiture(
                "AA-123-AA",
                "Tesla Model 3",
                80,
                FuelType.ELECTRIC,
                new MoteurElectrique()
        ));

        // Camion diesel
        flotte.add(new Camion(
                "BB-456-BB",
                "Renault Trucks",
                120,
                FuelType.DIESEL,
                new MoteurThermique(),
                18000
        ));

        // Parcours de la flotte
        for (Vehicule vehicule : flotte) {

            System.out.println("--------------------------------");

            System.out.println("Matricule : " + vehicule.getMatricule());
            System.out.println("Modèle : " + vehicule.getModele());
            System.out.println("Niveau de carburant : " + vehicule.getNiveauCarburant());
            System.out.println("Type d'énergie : " + vehicule.getFuelType());

            // Si c'est un camion, afficher sa capacité de charge
            if (vehicule instanceof Camion) {
                Camion camion = (Camion) vehicule;
                System.out.println("Capacité de charge : " + camion.getCapaciteCharge() + " kg");
            }

            // Démarrage du véhicule
            vehicule.demarrer();

            // Affichage de l'autonomie
            System.out.println("Autonomie : " + vehicule.obtenirAutonomie() + " km");
        }
    }
}
