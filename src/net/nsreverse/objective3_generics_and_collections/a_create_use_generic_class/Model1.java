package net.nsreverse.objective3_generics_and_collections.a_create_use_generic_class;

public class Model1<S, T extends Number> {
    private S name;
    private T age;

    public Model1(S name, T age) {
        this.name = name;
        this.age = age;
    }

    public S getName() {
        return name;
    }

    public int getAge() {
        return age.intValue();
    }
}
