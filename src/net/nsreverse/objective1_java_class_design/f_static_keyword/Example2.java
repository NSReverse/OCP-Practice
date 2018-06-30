package net.nsreverse.objective1_java_class_design.f_static_keyword;

import net.nsreverse.utils.Log;

/**
 * Example1 -
 *
 * This class shows effects of using the static keyword.
 */
public class Example2 {
    static int staticVar;   // 0

    static {
        staticVar++;        // 1
    }

    public static void executeExample() {
        StaticNested nested = new StaticNested();
        Log.out("Value of staticVar > " + staticVar);
    }

    public static class StaticNested {
        public StaticNested() {
            staticVar++;    // 2
        }
    }
}
