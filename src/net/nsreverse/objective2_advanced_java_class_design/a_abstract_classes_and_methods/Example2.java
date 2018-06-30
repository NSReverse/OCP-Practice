package net.nsreverse.objective2_advanced_java_class_design.a_abstract_classes_and_methods;

import net.nsreverse.utils.Log;

public class Example2 extends Example2_IsValid {
    public Example2() {
        super("test init");
    }
}

// This class declaration is valid for an abstract class.
// Abstract methods can have a concrete method and constructor for subclasses.
abstract class Example2_IsValid {
    private String value;

    public Example2_IsValid(String value) {
        this.value = value;
    }

    public void doSomething() {
        // concrete method.
        Log.out("Example2_IsValid.value -> " + value);
    }
}
