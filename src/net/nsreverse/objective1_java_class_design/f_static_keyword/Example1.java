package net.nsreverse.objective1_java_class_design.f_static_keyword;

import net.nsreverse.utils.Log;

/**
 * Example1 -
 *
 * This class shows effects of using the static keyword.
 */
public class Example1 {

    /**
     * static executeExample() -
     *
     * This method executes without an instance. Displays effects of using static variables.
     */
    public static void executeExample() {
        Holder holder1 = new Holder();
        Holder holder2 = new Holder();

        holder1.instanceValue = 1;
        holder1.staticValue = 1;    // IDE warns about modifying static value within an instance.

        Log.d("holder2.instanceValue -> " + holder2.instanceValue);   // 0
        Log.d("holder2.staticValue   -> " + holder2.staticValue);     // 1

        Holder.StaticHolder.executeExample();                                   // 1
    }
}

// POJO Object to help display differences between static and non-static members
class Holder {

    static {
        // Initialization code called once, even though there are 2 instances.
        // Cannot access instance variables in this scope.
        Log.d("Static Initializer -> Holder");
    }

    public int instanceValue = 0;
    public static int staticValue = 0;

    // Static classes must be declared inside of another class.
    // Has access to other static members of containing class.
    static class StaticHolder {
        static void executeExample() {
            Log.d("StaticHolder accessing Holder's static member, staticValue: " + staticValue);
        }
    }

}