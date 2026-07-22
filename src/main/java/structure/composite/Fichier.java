package structure.composite;

public class Fichier implements FileSystemComponent {

    private final String nom;
    private final long taille;

    public Fichier(String nom, long taille) {
        this.nom = nom;
        this.taille = taille;
    }

    @Override
    public String getName() {
        return nom;
    }

    @Override
    public long getSize() {
        return taille;
    }

    @Override
    public void afficher(String prefixe) {
        System.out.println(prefixe + "- " + nom + " (" + taille + " octets)");
    }
}
