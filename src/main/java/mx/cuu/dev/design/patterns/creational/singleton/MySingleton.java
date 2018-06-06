package mx.cuu.dev.design.patterns.creational.singleton;

/**
 * Singleton class example.
 * 
 * @author Julio Cesar Bolaños Palacios
 *
 */
public class MySingleton {

    private static MySingleton instance = null;

    private String value;

    // Private constructor.
    private MySingleton(String value) {
        this.value = value;
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton("Some value");
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
