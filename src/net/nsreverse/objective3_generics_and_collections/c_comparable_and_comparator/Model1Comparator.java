package net.nsreverse.objective3_generics_and_collections.c_comparable_and_comparator;

import java.util.Comparator;

public class Model1Comparator implements Comparator<Model1> {

    @Override
    public int compare(Model1 m1, Model1 m2) {
        int comp = m1.getName().compareTo(m2.getName());
        return (comp != 0) ? comp : m1.getAge() - m2.getAge();
    }
}
