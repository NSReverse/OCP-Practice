package net.nsreverse.objective1_java_class_design.e_singleton_design_pattern;

/**
 * Class Example1_2_Initialization_On_Demand -
 *
 * This class tests working with the initialization on demand
 * singleton pattern.
 */
public class Example1_2_Initialization_On_Demand {
    private Example1_2_Initialization_On_Demand() {} // Disable Constructor

    private static class SingletonHolder {
        private static final Example1_2_Initialization_On_Demand INSTANCE =
                new Example1_2_Initialization_On_Demand();
    }

    public static Example1_2_Initialization_On_Demand getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
