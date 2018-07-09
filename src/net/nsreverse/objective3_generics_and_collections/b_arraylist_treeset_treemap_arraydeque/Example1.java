package net.nsreverse.objective3_generics_and_collections.b_arraylist_treeset_treemap_arraydeque;

import net.nsreverse.utils.Log;

import java.util.*;

/**
 * Example1 -
 *
 * This class is a base for working ArrayList, TreeSet, TreeMap, and ArrayDeque.
 */
public class Example1 {

    public static void executeExample() {
        executeArrayListExample();
        executeTreeSetExample();
        executeTreeMapExample();
        executeArrayDequeExample();
    }

    /**
     * Method executeArrayListExample() -
     *
     * This method works with ArrayList with Strings.
     */
    private static void executeArrayListExample() {
        ArrayList<String> list1 = new ArrayList<>(10); // Backend array capacity starting at 10
        list1.add("A");             // ["A"]
        list1.add("B");             // ["A", "B"]
        list1.add("C");             // ["A", "B", "C"]

        list1.set(2, "D");          // ["A", "B", "D"]
        list1.remove(0);      // ["B", "D"]
        list1.remove("B");       // ["D"]

        Log.d("list1 first element -> " + list1.get(0)); // Prints "D"
    }

    /**
     * Method executeTreeSetExample() -
     *
     * This method works with TreeSet with Strings.
     */
    private static void executeTreeSetExample() {
        List<String> list1 = new ArrayList<>();
        list1.add("B"); // ["B"]
        list1.add("B"); // ["B", "B"]
        list1.add("A"); // ["B", "B", "A"]
        list1.add("A"); // ["B", "B", "A", "A"]
        list1.add("K"); // ["B", "B", "A", "A", "K"]
        list1.add("C"); // ["B", "B", "A", "A", "K", "C"]
        list1.add("C"); // ["B", "B", "A", "A", "K", "C", "C"]
        list1.add("K"); // ["B", "B", "A", "A", "K", "C", "C", "K"]

        TreeSet<String> set1 = new TreeSet<>(list1);

        Iterator<String> iterator = set1.iterator();

        // While loop that prints "A", "B", "C", "K"
        while (iterator.hasNext()) {
            Log.d("set1 contents: " + iterator.next());
        }
    }

    /**
     * Method executeTreeMapExample() -
     *
     * This method works with TreeMap.
     */
    private static void executeTreeMapExample() {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "B");
        map.put(1, "A");
        map.put(4, "C");

        TreeMap<Integer, String> treeMap = new TreeMap<>(map);

        // Print "A", "B", and "C"
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Log.d(entry.getValue());
        }
    }

    /**
     * Method executeArrayDequeExample() -
     *
     * This method works with ArrayDeque and Strings
     */
    private static void executeArrayDequeExample() {
        ArrayDeque<String> deque1 = new ArrayDeque<>(16); // Initial capacity of 16
        deque1.add("A"); // ["A"]
        deque1.add("B"); // ["A", "B"]
        deque1.add("C"); // ["A", "B", "C"]

        ArrayDeque<String> deque2 = new ArrayDeque<>(deque1);  // ["A", "B", "C"]

        Log.d("deque2 poll     -> " + deque2.poll());     // ["B", "C"] ("A" returned and removed)
        Log.d("deque2.peek     -> " + deque2.peek());     // "B" printed, no modification to array
        Log.d("deque2.getFirst -> " + deque2.getFirst()); // "B" printed, no modification to array
        Log.d("deque2.getLast  -> " + deque2.getLast());  // "C" printed, no modification to array
    }
}
