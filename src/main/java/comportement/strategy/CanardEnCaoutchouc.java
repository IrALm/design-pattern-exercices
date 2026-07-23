package comportement.strategy;

public class CanardEnCaoutchouc extends Canard {

    public CanardEnCaoutchouc() {
        super(new VolerImpossible(), new CriSiffler());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un canard en caoutchouc jaune.");
    }
}
