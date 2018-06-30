package net.nsreverse.objective1_java_class_design.c_implement_polymorphism;

import net.nsreverse.utils.Log;

/**
 * Class Example1_Child1 -
 *
 * This class is a simple polymorphism example.
 */
public class Example1_Child1 extends Example1 {
    @Override
    public void print() {
        Log.out("Printing from Child 1");
    }
}
