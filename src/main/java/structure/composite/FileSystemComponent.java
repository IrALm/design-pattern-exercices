package structure.composite;

public interface FileSystemComponent {

    String getName();

    long getSize();

    void afficher(String prefixe);
}
