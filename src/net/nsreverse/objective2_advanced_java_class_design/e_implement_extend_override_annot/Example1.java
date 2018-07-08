package net.nsreverse.objective2_advanced_java_class_design.e_implement_extend_override_annot;

import net.nsreverse.utils.Log;

public class Example1 implements IFace1,
                                 IFace2 {

    @Override // From IFace1
    public void methodX() {
        // Interface-compliant method for IFace1
        Log.d("Interface-compliant method for IFace1");
    }

    @Override // From IFace2
    public void methodY() {
        // Interface-compliant method for IFace2
        Log.d("Interface-compliant method for IFace2");
    }
}

interface IFace1 {
    void methodX();
}

interface IFace2 {
    void methodY();
}
