package net.nsreverse;

import net.nsreverse.objective1_java_class_design.b_implement_inheritence.Example1;

public class Main {

    public static void main(String[] args) {
        Example1 example1 = new Example1();

        example1.doX();
        // example1.doY(); // Protected member, cannot access here.
        // example1.doZ(); // Private member, not inherited.
    }
}
