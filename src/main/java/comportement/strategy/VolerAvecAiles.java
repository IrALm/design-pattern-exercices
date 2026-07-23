package comportement.strategy;

public class VolerAvecAiles implements ComportementVol {

    @Override
    public void voler() {
        System.out.println("Je vole avec mes ailes !");
    }
}
