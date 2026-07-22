package creation.singleton;

/**
 * Singleton thread-safe.
 */
public class AppLogger {

    private static volatile AppLogger instance;

    private int logCount;

    private AppLogger() {
        logCount = 0;
    }

    public static AppLogger getInstance() {
        if (instance == null) {
            synchronized (AppLogger.class) {
                if (instance == null) {
                    instance = new AppLogger();
                }
            }
        }
        return instance;
    }

    public synchronized void log(String message) {
        logCount++;
        System.out.println("[LOG #" + logCount + "] " + message);
    }

    public int getLogCount() {
        return logCount;
    }
}
