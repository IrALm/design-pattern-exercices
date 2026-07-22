package creation.singleton;

public class Main {

    public static void main(String[] args) {
        AppLogger logger1 = AppLogger.getInstance();
        logger1.log("Application démarrée");
        logger1.log("Chargement de la configuration");

        AppLogger logger2 = AppLogger.getInstance();
        logger2.log("Connexion à la base de données");

        System.out.println("logger1 == logger2 : " + (logger1 == logger2));
        System.out.println("Nombre total de logs : " + logger2.getLogCount());
    }
}
