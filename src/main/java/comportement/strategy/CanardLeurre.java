package comportement.strategy;

public class CanardLeurre extends Canard {

    public CanardLeurre() {
        super(new VolerImpossible(), new CriSilencieux());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un canard leurre en bois, utilisé pour la chasse.");
    }
}
