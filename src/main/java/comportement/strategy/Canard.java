package comportement.strategy;

public abstract class Canard {

    private ComportementVol comportementVol;
    private ComportementCri comportementCri;

    protected Canard(ComportementVol comportementVol, ComportementCri comportementCri) {
        this.comportementVol = comportementVol;
        this.comportementCri = comportementCri;
    }

    public void nager() {
        System.out.println("Je nage.");
    }

    public void voler() {
        comportementVol.voler();
    }

    public void crier() {
        comportementCri.crier();
    }

    // Changement de stratégie à l'exécution, sans toucher à la hiérarchie
    // de classes ni recompiler quoi que ce soit.
    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public void setComportementCri(ComportementCri comportementCri) {
        this.comportementCri = comportementCri;
    }

    public abstract void afficher();
}
