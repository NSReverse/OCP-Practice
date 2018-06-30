package net.nsreverse.objective1_java_class_design.e_singleton_design_pattern;

/**
 * Class Example1_3_Eager_Initialization -
 *
 * This class demonstrates the creation of an immutable class.
 */
public final class Example2_Immutable_Classes {
    public final String value1;
    public final int value2;

    public Example2_Immutable_Classes(String value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }
}
