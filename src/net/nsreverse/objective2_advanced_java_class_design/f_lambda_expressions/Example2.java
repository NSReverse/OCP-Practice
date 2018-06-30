package net.nsreverse.objective2_advanced_java_class_design.f_lambda_expressions;

import net.nsreverse.utils.Log;

/**
 * Example2 -
 *
 * This class demonstrates the passing of a lambda expression as an argument.
 */
public class Example2 {
    public static void executeExample() {

        /*
         * This expression can be shorted to:
         * call(() -> "Callback has been completed from anonymous inner class from Example2.");
         *
         * The current state of this expression allows for multiple lines of code in this block.
         */
        call(() -> {
            return "Callback has been completed from anonymous inner class from Example2.";
        });

        call2();
    }

    /**
     * Method call(IFace2) -
     *
     * This method takes a lambda/anon class and then executes the callback.
     *
     * @param if2 Anonymous/lambda argument based on a functional interface.
     */
    private static void call(IFace2 if2) {
        Log.out(if2.callback());
    }

    private static void call2() {
        /* The below line is equivalent to :
         *      IFace2_1 if2 = new IFace2_1({
         *          @Override
         *          int add(int x, int y) {
         *              return x + y;
         *          }
         *      });
         *
         */
        // IFace2_1 if2 = (int x, int y) -> x + y; // Can be further shortened to the below expression.
        // The below expression omits (and therefore implies) the type based on the context of the interface,
        // However, if types are specified, they must match exactly.
        IFace2_1 if2 = (x, y) -> x + y;

        Log.out("Lambda expression multiple arguments (add 2 ints) -> " + if2.add(4, 3));
    }

    public interface IFace2 {
        String callback();
    }

    public interface IFace2_1 {
        int add(int x, int y);
    }
}

