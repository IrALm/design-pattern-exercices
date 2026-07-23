package comportement.templatemethod;

public abstract class DataMiner {

    // Méthode template : fixe la séquence de l'algorithme. Final pour
    // empêcher les sous-classes de modifier l'ordre des étapes.
    public final void mine(String path) {
        openFile(path);
        extractData();
        parseData();
        closeFile(path);
    }

    protected void openFile(String path) {
        System.out.println("Ouverture du fichier : " + path);
    }

    protected void closeFile(String path) {
        System.out.println("Fermeture du fichier : " + path);
    }

    protected abstract void extractData();

    protected abstract void parseData();
}
