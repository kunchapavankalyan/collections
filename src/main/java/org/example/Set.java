package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args)
    {
        System.out.println("=== HashSet Example ===");
        hashSetExample();

        System.out.println("\n=== LinkedHashSet Example ===");
        linkedHashSetExample();

        System.out.println("\n=== TreeSet Example ===");
        treeSetExample();
    }

    private static void hashSetExample()
    {
        // Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate will be ignored
        hashSet.add(null); // Allows null

        // Printing the Set
        System.out.println("HashSet: " + hashSet);

        // Checking if an element exists
        System.out.println("Contains 'Banana'? " + hashSet.contains("Banana"));

        // Removing an element
        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);

        // Iterating over elements
        System.out.println("Iterating through HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Clearing the set
        hashSet.clear();
        System.out.println("After clearing, is HashSet empty? " + hashSet.isEmpty());
    }

    private static void linkedHashSetExample()
    {
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Dog");
        linkedHashSet.add("Cat");
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Dog"); // Duplicate will be ignored

        // Printing the Set
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Checking the size of the Set
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Iterating using an iterator
        System.out.println("Iterating through LinkedHashSet:");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // Removing all elements
        linkedHashSet.clear();
        System.out.println("After clearing, is LinkedHashSet empty? " + linkedHashSet.isEmpty());
    }

    private static void treeSetExample()
    {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        // treeSet.add(null); // Uncommenting this will throw NullPointerException

        // Printing the Set
        System.out.println("TreeSet (sorted): " + treeSet);

        // Checking the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Removing an element
        treeSet.remove(20);
        System.out.println("After removing 20: " + treeSet);

        // Checking if an element exists
        System.out.println("Contains 30? " + treeSet.contains(30));

        // Iterating using for-each loop
        System.out.println("Iterating through TreeSet:");
        for (Integer element : treeSet) {
            System.out.println(element);
        }
    }
}
/*
 * === HashSet Example ===
HashSet: [null, Apple, Cherry, Banana]
Contains 'Banana'? true
After removing 'Cherry': [null, Apple, Banana]
Iterating through HashSet:
null
Apple
Banana
After clearing, is HashSet empty? true

=== LinkedHashSet Example ===
LinkedHashSet: [Dog, Cat, Elephant]
Size of LinkedHashSet: 3
Iterating through LinkedHashSet:
Dog
Cat
Elephant
After clearing, is LinkedHashSet empty? true

=== TreeSet Example ===
TreeSet (sorted): [10, 20, 30, 40]
First element: 10
Last element: 40
After removing 20: [10, 30, 40]
Contains 30? true
Iterating through TreeSet:
10
30
40
 *
 */

