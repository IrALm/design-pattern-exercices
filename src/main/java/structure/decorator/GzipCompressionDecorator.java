package structure.decorator;

public class GzipCompressionDecorator extends CompressionDecorator {

    private static final String MARQUEUR = "GZIP";

    public GzipCompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    protected String compresser(String donnees) {
        System.out.println("[GzipCompressionDecorator] Compression gzip appliquée.");
        return MARQUEUR + "(" + donnees + ")";
    }

    @Override
    protected String decompresser(String donnees) {
        return donnees.substring(MARQUEUR.length() + 1, donnees.length() - 1);
    }
}
