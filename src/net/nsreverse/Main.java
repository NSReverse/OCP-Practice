package net.nsreverse;

import net.nsreverse.objective1_java_class_design.e_singleton_design_pattern.Example2_Immutable_Classes;

public class Main {

    public static void main(String[] args) {
        Example2_Immutable_Classes ex2 = new Example2_Immutable_Classes("asdf", 12);
        // ex2.value1 = "qwerty"; // Unable to perform this action. Final.
        // ex2.value2 = 213;      // Unable to perform this action. Final.
    }
}
