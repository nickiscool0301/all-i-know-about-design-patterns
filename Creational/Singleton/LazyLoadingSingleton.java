package Creational.Singleton;

public class LazyLoadingSingleton {
    private static volatile LazyLoadingSingleton instance;
    private LazyLoadingSingleton() {}
    public static synchronized LazyLoadingSingleton getInstance() {
        if(instance == null) {
            instance = new LazyLoadingSingleton();
        }
        return instance;
    }
}

/*
Pros:
- The instance is created only when needed, saving resources.
Cons:
- Not thread-safe. Multiple threads could create multiple instances.


-> Solution: use synchronized in the getInstance method
-> can cause performance issue since getInstance() has to acquire a lock


-> To improve: use Double check locking



 */