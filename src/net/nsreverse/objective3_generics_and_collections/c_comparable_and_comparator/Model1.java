package net.nsreverse.objective3_generics_and_collections.c_comparable_and_comparator;

/**
 * Model1 -
 *
 * This is a sample class that implements the Comparable interface to compare a String and int.
 */
public class Model1 implements Comparable<Model1> {

    private String name;
    private int age;

    public Model1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Model1 model) {
        int comp = name.compareTo(model.name);          // Check if name is equal
        return (comp != 0) ? comp : model.age - age;    // If name is equal, then compare the age.
    }
}
