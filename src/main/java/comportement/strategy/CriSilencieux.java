package comportement.strategy;

public class CriSilencieux implements ComportementCri {

    @Override
    public void crier() {
        System.out.println("...(silence)...");
    }
}
