package net.nsreverse.objective3_generics_and_collections.a_create_use_generic_class;

import net.nsreverse.utils.Log;

/**
 * Example1 -
 *
 * This class is a base for working with a generic class.
 */
public class Example1 {
    public static void executeExample() {

        // Create a new generic instantiation
        Model1<String, Integer> sampleModel = new Model1<>("Robert", 99);

        // Log output with values stored in generic implementation
        Log.d("Sample Model -> Name : " + sampleModel.getName());
        Log.d("Sample Model -> Age  : " + sampleModel.getAge());
    }
}
