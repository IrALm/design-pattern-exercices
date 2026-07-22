package structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends FileSystemComponent {

    private final List<FileSystemComponent> enfants = new ArrayList<>();

    public Dossier(String nom) {
        super(nom);
    }

    public void ajouter(FileSystemComponent composant) {
        enfants.add(composant);
    }

    public void retirer(FileSystemComponent composant) {
        enfants.remove(composant);
    }

    @Override
    public long getSize() {
        long taille = 0;
        for (FileSystemComponent enfant : enfants) {
            taille += enfant.getSize();
        }
        return taille;
    }

    @Override
    public void afficher(String prefixe) {
        System.out.println(prefixe + "+ " + getName() + "/ (" + getSize() + " octets)");
        for (FileSystemComponent enfant : enfants) {
            enfant.afficher(prefixe + "  ");
        }
    }
}
