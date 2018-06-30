package net.nsreverse.objective2_advanced_java_class_design.f_lambda_expressions;

import net.nsreverse.utils.Log;

/**
 * Example1 -
 *
 * This class demonstrates the difference in syntax between a lambda expression and a regular anonymous class.
 */
public class Example1 {
    public void executeExample() {

        // Anonymous class
        IFace1 i1 = new IFace1() {
            @Override
            public void executeMethod1() {
                Log.out("i1 anonymous class method execute.");
            }
        };

        // Lambda Expression
        IFace1 i2 = () -> {
            Log.out("i2 anonymous class method execute with lambda expression");
        };

        i1.executeMethod1();
        i2.executeMethod1();
    }
}

interface IFace1 {
    void executeMethod1();
}