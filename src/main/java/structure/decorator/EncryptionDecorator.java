package structure.decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    private static final String MARQUEUR = "ENC";

    private final String cle;

    public EncryptionDecorator(DataSource wrappee, String cle) {
        super(wrappee);
        this.cle = cle;
    }

    @Override
    public void writeData(String data) {
        super.writeData(chiffrer(data));
    }

    @Override
    public String readData() {
        return dechiffrer(super.readData());
    }


    private String chiffrer(String donnees) {
        System.out.println("[EncryptionDecorator] Chiffrement appliqué (clé : " + cle + ").");
        return MARQUEUR + "(" + donnees + ")";
    }

    private String dechiffrer(String donnees) {
        return donnees.substring(MARQUEUR.length() + 1, donnees.length() - 1);
    }
}
