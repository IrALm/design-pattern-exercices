package comportement.strategy;

public class VolerImpossible implements ComportementVol {

    @Override
    public void voler() {
        System.out.println("Je ne sais pas voler.");
    }
}
