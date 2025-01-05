package Creational.Singleton;

public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;
    private StaticBlockSingleton(){}
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Error in creating singleton instance");
        }
    }
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}

/*
Reminder about order:
1. static field
2. static block
3. main method
4. instance fields
5. instance block
6. constructor
7. end of main method
 */