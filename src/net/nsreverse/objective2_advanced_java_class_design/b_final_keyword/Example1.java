package net.nsreverse.objective2_advanced_java_class_design.b_final_keyword;

import net.nsreverse.utils.Log;

public class Example1 {
    private final int i;    // Unmodifiable.

    /* // Initializer block able to assign before a constructor is called.
    {
        i = 0;
    }
    */

    public Example1() {
        i = 0;
    }

    public Example1(int i) {
        this.i = i;
    }

    /**
     * final doX() -
     *
     * This method is final and cannot be overridden or hidden in a subclass.
     * Prints out text.
     */
    public final void doX() {
        Log.out("Example1.i -> " + i);
    }

    public void doY() {
        final int x;    // Must be assigned before use
        x = 22;         // legal as long as x is not assigned again.

        Log.out("doY(): x -> " + x);
    }

    public static class Example1_Child extends Example1 {
        /* // Forbidden as doX() is a final method
         * @Override
         * public void doX() {
         *
         * }
         */
    }
}