package comportement.strategy;

public class CanardModele extends Canard {

    public CanardModele() {
        super(new VolerImpossible(), new CriSilencieux());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un canard modèle (prototype d'usine, sans comportement final).");
    }
}
