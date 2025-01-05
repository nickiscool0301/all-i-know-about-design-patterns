1. Bootstrap Class Loader
- Role: Loads the core Java classes from the `rt.jar` file : `java.lang.String`, `java.util.ArrayList`, etc.
- Location: JVM's internal implementation; it is written in native code.
- Parent: None (it's at the top of the hierarchy).

2. Extension Class Loader
- Role: Loads classes from the lib/ext directory or the `java.ext.dirs` system property.
- Parent: Delegates to the Bootstrap Class Loader.

3. Application (or System) Class Loader
- Role: Loads classes from the application's classpath (CLASSPATH environment variable or -cp command-line option).
- Parent: Delegates to the Extension Class Loader.

4. Custom Class Loaders
- Developers can create custom class loaders by extending the ClassLoader class to load classes in a specific way (e.g., from a database, network, or custom directory).