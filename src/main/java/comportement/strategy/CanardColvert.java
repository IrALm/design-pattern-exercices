package comportement.strategy;

public class CanardColvert extends Canard {

    public CanardColvert() {
        super(new VolerAvecAiles(), new CriCoinCoin());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un colvert (plumage vert et gris).");
    }
}
