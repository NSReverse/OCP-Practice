package net.nsreverse.objective1_java_class_design.e_singleton_design_pattern;

/**
 * Class Example1_1_Lazy_Initialization -
 *
 * This class tests working with the lazy initialization
 * singleton pattern.
 */
public class Example1_1_Lazy_Initialization {
    private static Example1_1_Lazy_Initialization INSTANCE;

    private Example1_1_Lazy_Initialization() {} // Disable Constructor

    public synchronized static Example1_1_Lazy_Initialization getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Example1_1_Lazy_Initialization();
        }

        return INSTANCE;
    }
}
