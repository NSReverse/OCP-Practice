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
        Log.d("Child do X");
        super.doX();
    }

    @Override
    protected void doY() {
        Log.d("Child do X");
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
        Log.d("Parent do X");
    }
    protected void doY() {
        Log.d("Parent do Y");
    }
    private void doZ() {
        Log.d("Parent do Z");
    }
}
