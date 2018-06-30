package net.nsreverse.objective1_java_class_design.b_implement_inheritence;

import net.nsreverse.utils.Log;

/**
 * Class Example1 -
 *
 * This class is a simple inheritence.
 */
public class Example1 extends ExampleParent {
    @Override
    public void doX() {
        Log.out("Child do X");
        super.doX();
    }

    @Override
    protected void doY() {
        Log.out("Child do X");
        super.doY();
    }
}

/**
 * Class ExampleParent -
 *
 * This class is a simple parent class with different accessible members.
 */
class ExampleParent {
    public void doX() {
        Log.out("Parent do X");
    }
    protected void doY() {
        Log.out("Parent do Y");
    }
    private void doZ() {
        Log.out("Parent do Z");
    }
}
