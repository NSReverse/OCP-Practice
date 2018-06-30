package net.nsreverse;

import net.nsreverse.objective2_advanced_java_class_design.b_final_keyword.Example1;

public class Main {

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        Example1 e2 = new Example1(123);

        e1.doX();       // 0
        e2.doX();       // 123

        e1.doY();       // 22

        Example1.Example1_Child child = new Example1.Example1_Child();
        child.doX();    // 0
    }
}
