package exercice2;

/*====================================================
  FACTORY METHOD (simple factory)
  Seul point du code qui connaît la correspondance
  OS -> fabrique concrète. Le reste de l'application
  ne manipule que l'abstraction GUIFactory.
====================================================*/
final class GUIFactoryProducer {

    private GUIFactoryProducer() {
        // Classe utilitaire : pas d'instanciation
    }

    static GUIFactory getFactory(OperatingSystem os) {
        return switch (os) {
            case WINDOWS -> new WindowsFactory();
            case MAC -> new MacFactory();
        };
    }
}
