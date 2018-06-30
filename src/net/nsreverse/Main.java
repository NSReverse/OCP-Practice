package net.nsreverse;

import net.nsreverse.objective2_advanced_java_class_design.a_abstract_classes_and_methods.Example1;
import net.nsreverse.objective2_advanced_java_class_design.a_abstract_classes_and_methods.Example2;

public class Main {

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.printExample();      // print -> Method override from AbstractExample1.

        Example2 e2 = new Example2();
        e2.doSomething();       // print -> test init
    }
}
