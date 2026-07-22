package structure.composite;

public class Fichier extends FileSystemComponent {

    private final long taille;

    public Fichier(String nom, long taille) {
        super(nom);
        this.taille = taille;
    }

    @Override
    public long getSize() {
        return taille;
    }

    @Override
    public void afficher(String prefixe) {
        System.out.println(prefixe + "- " + getName() + " (" + taille + " octets)");
    }
}
