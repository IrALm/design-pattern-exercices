package structure.decorator;

public class ZipCompressionDecorator extends CompressionDecorator {

    private static final String MARQUEUR = "ZIP";

    public ZipCompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }


    @Override
    protected String compresser(String donnees) {
        System.out.println("[ZipCompressionDecorator] Compression zip appliquée.");
        return MARQUEUR + "(" + donnees + ")";
    }

    @Override
    protected String decompresser(String donnees) {
        return donnees.substring(MARQUEUR.length() + 1, donnees.length() - 1);
    }
}
