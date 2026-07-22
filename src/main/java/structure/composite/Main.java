package structure.composite;

public class Main {

    public static void main(String[] args) {
        Dossier racine = new Dossier("projet");

        Dossier src = new Dossier("src");
        src.ajouter(new Fichier("Main.java", 5_000));
        src.ajouter(new Fichier("Utils.java", 3_000));

        Dossier images = new Dossier("images");
        images.ajouter(new Fichier("logo.png", 150_000));
        images.ajouter(new Fichier("banniere.jpg", 220_000));

        racine.ajouter(new Fichier("readme.txt", 2_000));
        racine.ajouter(src);
        racine.ajouter(images);

        racine.afficher("");

        System.out.println();
        System.out.println("Taille totale de '" + racine.getName() + "' : " + racine.getSize() + " octets");
    }
}
