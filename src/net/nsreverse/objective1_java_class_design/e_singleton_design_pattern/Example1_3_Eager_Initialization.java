package net.nsreverse.objective1_java_class_design.e_singleton_design_pattern;

/**
 * Class Example1_3_Eager_Initialization -
 *
 * This class tests working with the eager initialization
 * singleton pattern.
 */
public class Example1_3_Eager_Initialization {
    private static final Example1_3_Eager_Initialization INSTANCE =
            new Example1_3_Eager_Initialization();

    private Example1_3_Eager_Initialization() {} // Disable Constructor

    public static Example1_3_Eager_Initialization getInstance() {
        return INSTANCE;
    }
}
