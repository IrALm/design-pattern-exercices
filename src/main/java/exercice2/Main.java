package exercice2;

/*====================================================
  EXERCICE 2 : Design Pattern de création n°1
  UI multiplateforme découplée (Abstract Factory +
  Factory Method)
====================================================*/
public class Main {

    public static void main(String[] args) {

        // Seule cette ligne connaît la logique de sélection de l'OS.
        OperatingSystem osActuel = detecterOS();

        // Le client obtient une fabrique cohérente avec l'OS...
        GUIFactory factory = GUIFactoryProducer.getFactory(osActuel);

        // ...puis construit son UI sans jamais toucher une classe concrète.
        Application application = new Application(factory);

        System.out.println("=== Application lancée sur " + osActuel + " ===");
        application.creerUI();
        application.simulerInteraction();
    }

    private static OperatingSystem detecterOS() {
        String osName = System.getProperty("os.name", "").toLowerCase();
        return osName.contains("mac") ? OperatingSystem.MAC : OperatingSystem.WINDOWS;
    }
}
