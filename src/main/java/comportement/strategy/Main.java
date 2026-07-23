package comportement.strategy;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Canard colvert ===");
        Canard colvert = new CanardColvert();
        colvert.afficher();
        colvert.nager();
        colvert.voler();
        colvert.crier();

        System.out.println();
        System.out.println("=== Canard en caoutchouc ===");
        Canard caoutchouc = new CanardEnCaoutchouc();
        caoutchouc.afficher();
        caoutchouc.nager();
        caoutchouc.voler();
        caoutchouc.crier();

        System.out.println();
        System.out.println("=== Canard leurre ===");
        Canard leurre = new CanardLeurre();
        leurre.afficher();
        leurre.nager();
        leurre.voler();
        leurre.crier();

        System.out.println();
        System.out.println("=== Canard modèle : comportements changés dynamiquement ===");
        Canard modele = new CanardModele();
        modele.afficher();
        modele.voler();
        modele.crier();

        System.out.println("-- On lui attribue des ailes et un cri coin-coin à l'exécution --");
        modele.setComportementVol(new VolerAvecAiles());
        modele.setComportementCri(new CriCoinCoin());
        modele.voler();
        modele.crier();
    }
}
