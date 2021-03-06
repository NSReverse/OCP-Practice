package net.nsreverse.objective2_advanced_java_class_design.c_inner_classes;

import net.nsreverse.utils.Log;

/**
 * Example1 -
 *
 * This class is for testing various inner classes.
 */
public class Example1 {

    public class Inner {
        // private static final Integer i = new Integer(0); // Inner classes cannot have static members
        void doX() {
            Log.d("Inner class, doX()");
        }
    }

    public void myMethod() {
        Inner inner = new Inner();
        inner.doX();
    }

    public static void main(String[] args) {
        int i = 0;

        /* // Invalid code block. Unable to
         * // instantiate this Data1 class because it is not declared before instantiating it.
         *
         * Data1 data = new Data1(0);
         *
         * class Data1 {
         *   int var;
         *
         *   Data(int var) { this.var = var; }
         * }
         */
    }
}
