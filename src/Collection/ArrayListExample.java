package Collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();

        // Add element to arraylist
        list.add("Java");
        list.add("c");
        list.add("Python");
        list.add("PHP");
        list.add("Soft");
        System.out.println("ArrayList : "+list);

        // Get the element from the arraylist
        String str = list.get(2);
        System.out.println("Element at index 2 :" +str);

        // Change the element of the arraylist
        list.set(4,"Javascript");
        System.out.println("Modified ArrayList :" +list);

        // Get the number of element of arraylist
        int size = list.size();
        System.out.println("Length of the ArrayList :" +size);

        // Sort the arraylist
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList :" +list);

        // Remove the element from arraylist
        String str1 = list.remove(2);
        System.out.println("Updated ArrayList :" +list);
        System.out.println("Removed Element :" +str1);
    }
}
