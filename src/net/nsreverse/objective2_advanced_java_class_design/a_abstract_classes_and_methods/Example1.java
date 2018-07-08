package net.nsreverse.objective2_advanced_java_class_design.a_abstract_classes_and_methods;

import net.nsreverse.utils.Log;

/**
 * Example1 -
 *
 * This class demonstrates a simple implementation of an abstract method.
 */
public class Example1 extends AbstractExample1 {
    @Override
    public void printExample() {
        Log.d("Method overridden from abstract class AbstractExample1.");
    }
}

abstract class AbstractExample1 {
    abstract public void printExample();
}
