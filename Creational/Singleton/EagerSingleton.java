package Creational.Singleton;

// Not good in multi-thread environment
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();
    private EagerSingleton() {}
    public static EagerSingleton getEagerSingleton() {
        return INSTANCE;
    }
}
