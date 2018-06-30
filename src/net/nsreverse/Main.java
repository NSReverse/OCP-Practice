package net.nsreverse;

import net.nsreverse.objective1_java_class_design.d_override_hashcode_equals_tostring.Example1;
import net.nsreverse.utils.Log;

public class Main {

    public static void main(String[] args) {
        Example1 example1 = new Example1();

        Log.out("" + example1.equals(new Example1()));  // true
        Log.out("" + example1.hashCode());              // HashCode appears here
        Log.out(example1.toString());                           // Example1 > Value = 1

        Example1 example1_2 = new Example1();
        example1_2.setValue(4);
        Log.out("" + example1.equals(example1_2));      // false
    }
}
