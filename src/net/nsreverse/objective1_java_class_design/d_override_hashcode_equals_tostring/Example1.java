package net.nsreverse.objective1_java_class_design.d_override_hashcode_equals_tostring;

/**
 * Class Example1 -
 *
 * This class tests working with hashCode, equals, and toString from the Object class.
 */
public class Example1 {
    private int value = 1;

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // return super.equals(obj);

        if (obj instanceof Example1) {
            if (value == ((Example1)obj).value) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return Example1.class.getSimpleName() + " > Value = " + value;
    }
}
