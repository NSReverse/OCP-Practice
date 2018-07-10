package net.nsreverse.objective3_generics_and_collections.c_comparable_and_comparator;

import net.nsreverse.utils.Log;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.List;

/**
 * Example1 -
 *
 * This class is a base for working with Comparable and Comparator.
 */
public class Example1 {

    public static void executeExamples() {
        executeComparableExample();
        executeComparatorExample();
    }

    /**
     * Method executeComparableExample() -
     *
     * This method uses the Model1 class method compareTo, which satisfies
     * the requirement for the Comparable interface.
     */
    private static void executeComparableExample() {
        Model1 firstModel = new Model1("John", 21);
        Model1 secondModel = new Model1("Jane", 23);
        Model1 thirdModel = new Model1("John", 22);
        Model1 fourthModel = new Model1("Jane", 23);

        Log.d("firstModel compared to secondModel  -> " + firstModel.compareTo(secondModel));
        Log.d("secondModel compared to firstModel  -> " + secondModel.compareTo(firstModel));
        Log.d("firstModel compared to thirdModel   -> " + firstModel.compareTo(thirdModel));
        Log.d("secondModel compared to fourthModel -> " + secondModel.compareTo(fourthModel));
    }

    /**
     * Method executeComparatorExample() -
     *
     * This method uses the Model1 class method compareTo and an
     * implementation of the Comparator interface with the class
     * Model1Comparator to sort a list based on Alphabetical,
     * the age comparisons.
     */
    private static void executeComparatorExample() {
        List<Model1> models = new ArrayList<>();
        models.add(new Model1("James", 27));
        models.add(new Model1("John", 21));
        models.add(new Model1("Emma", 30));
        models.add(new Model1("Jane", 23));
        models.add(new Model1("John", 22));

        for (Model1 currentModel : models) {
            Log.i("Unsorted models : " + currentModel.getName() + ", " + currentModel.getAge());
        }

        // Collections.sort(models, new Model1Comparator());
        models.sort(new Model1Comparator());

        for (Model1 currentModel : models) {
            Log.i("Sorted models   : " + currentModel.getName() + ", " + currentModel.getAge());
        }
    }
}
