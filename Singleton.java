public class Singleton {
    private static final Singleton SINGLETON_INSTANCE = new Singleton();
    private Singleton() {}
    public Singleton getSingletonInstance() {
        return SINGLETON_INSTANCE;
    }

}
