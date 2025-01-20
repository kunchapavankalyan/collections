import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods
{
    public static void main(String[] args)
    {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements
        System.out.println("Adding elements:");
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println(arrayList);

        // Add elements at a specific index
        System.out.println("\nAdding 15 at index 1:");
        arrayList.add(1, 15);
        System.out.println(arrayList);

        // Add multiple elements (addAll)
        System.out.println("\nAdding multiple elements [60, 70, 80]:");
        arrayList.addAll(Arrays.asList(60, 70, 80));
        System.out.println(arrayList);

        // Access an element
        System.out.println("\nElement at index 2: " + arrayList.get(2));

        // Update an element
        System.out.println("\nUpdating element at index 2 to 35:");
        arrayList.set(2, 35);
        System.out.println(arrayList);

        // Remove an element by index
        System.out.println("\nRemoving element at index 3:");
        arrayList.remove(3);
        System.out.println(arrayList);

        // Remove an element by value
        System.out.println("\nRemoving element with value 15:");
        arrayList.remove(Integer.valueOf(15));
        System.out.println(arrayList);

        // Check if an element exists (contains)
        System.out.println("\nDoes the list contain 50? " + arrayList.contains(50));

        // Get the size of the ArrayList
        System.out.println("\nSize of the list: " + arrayList.size());

        // Iterate using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Iterate using for loop
        System.out.println("\nIterating using for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        // Get a sublist
        System.out.println("\nSublist from index 1 to 4:");
        System.out.println(arrayList.subList(1, 4));

        // Sort the ArrayList
        System.out.println("\nSorting the list:");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // Reverse the ArrayList
        System.out.println("\nReversing the list:");
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        // Clear the ArrayList
        System.out.println("\nClearing the list:");
        arrayList.clear();
        System.out.println("Is the list empty? " + arrayList.isEmpty());
    }
}
