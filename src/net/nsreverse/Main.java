package net.nsreverse;

import net.nsreverse.objective1_java_class_design.c_implement_polymorphism.Example1;
import net.nsreverse.objective1_java_class_design.c_implement_polymorphism.Example1_Child1;
import net.nsreverse.objective1_java_class_design.c_implement_polymorphism.Example1_Child2;

public class Main {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        Example1_Child1 child1 = new Example1_Child1();
        Example1_Child2 child2 = new Example1_Child2();

        example1.print();   // Printing from parent
        child1.print();     // Printing from Child 1
        child2.print();     // Printing from Child 2
    }
}
