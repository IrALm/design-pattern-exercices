package structure.composite;

public abstract class FileSystemComponent {

    private final String nom;

    protected FileSystemComponent(String nom) {
        this.nom = nom;
    }

    public String getName() {
        return nom;
    }

    public abstract long getSize();

    public abstract void afficher(String prefixe);
}
