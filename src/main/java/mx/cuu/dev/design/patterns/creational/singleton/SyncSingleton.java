package mx.cuu.dev.design.patterns.creational.singleton;

/**
 * Synchronized singleton class.
 * 
 * @author Julio Cesar Bolaños Palacios
 *
 */
public class SyncSingleton {

    private static SyncSingleton instance = null;

    private String value;

    private SyncSingleton(String value) {
        this.value = value;
    }

    public SyncSingleton getInstance() {
        synchronized (SyncSingleton.class) {
            if (instance == null) {
                instance = new SyncSingleton("Some Sync Value");
            }
        }
        return instance;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
}
