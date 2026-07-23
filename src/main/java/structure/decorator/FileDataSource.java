package structure.decorator;

public class FileDataSource implements DataSource {

    private final String chemin;
    private String contenu;

    public FileDataSource(String chemin) {
        this.chemin = chemin;
    }

    @Override
    public void writeData(String data) {
        this.contenu = data;
        System.out.println("[FileDataSource] Données écrites dans " + chemin
                + " (" + data.length() + " caractères).");
    }

    @Override
    public String readData() {
        System.out.println("[FileDataSource] Données lues depuis " + chemin
                + " (" + contenu.length() + " caractères).");
        return contenu;
    }
}
