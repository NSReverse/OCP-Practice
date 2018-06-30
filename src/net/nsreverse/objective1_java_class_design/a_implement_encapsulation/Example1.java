package net.nsreverse.objective1_java_class_design.a_implement_encapsulation;

/**
 * Class Example1 -
 *
 * This class is a simple encapsulation that prevents an int field from being set to a negative number.
 */
public class Example1 {
    private int value;

    /**
     * getValue() -
     *
     * This method returns value.
     *
     * @return An int representing value.
     */
    public int getValue() {
        return value;
    }

    /**
     * setValue(int) -
     *
     * This method sets value.
     *
     * @param value An int representing what value should be. This value should be positive.
     */
    public void setValue(int value) {
        if (value < 0) {
            System.out.println("The input value is invalid. Should never be negative");
            this.value = -1;
        }
        else {
            this.value = value;
        }
    }
}
