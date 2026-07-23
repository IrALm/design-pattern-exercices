package structure.decorator;

public class Main {

    public static void main(String[] args) {
        String texte = "Ceci est un contenu de test.";

        System.out.println("=== Compression seule (gzip) ===");
        DataSource source1 = new GzipCompressionDecorator(new FileDataSource("data_gzip.txt"));
        traiter(source1, texte);

        System.out.println();
        System.out.println("=== Compression (zip) + chiffrement ===");
        DataSource source2 = new EncryptionDecorator(
                new ZipCompressionDecorator(new FileDataSource("data_zip_enc.txt")),
                "cleSecrete123");
        traiter(source2, texte);

        System.out.println();
        System.out.println("=== Chiffrement seul ===");
        DataSource source3 = new EncryptionDecorator(new FileDataSource("data_enc.txt"), "autreCle");
        traiter(source3, texte);
    }

    // Le client ne connaît que l'interface DataSource : cette méthode ne change
    // jamais, quelle que soit la combinaison de décorateurs utilisée.
    private static void traiter(DataSource source, String donnees) {
        source.writeData(donnees);
        String relu = source.readData();
        System.out.println("Contenu identique après traitement : " + donnees.equals(relu));
    }
}
