package Creational.Singleton;

public class BillPughSingleton {
    private BillPughSingleton() {}

    public static BillPughSingleton getInstance() {
        return SingletonHealper.INSTANCE;
    }

    private static class SingletonHealper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();

    }
}


// works like Lazy loading, the singleton helper only load when we call the getInstance()
//Pros:
//Thread-safe without synchronization.
//Lazy initialization.
//Cons:
//Slightly more complex than other methods.