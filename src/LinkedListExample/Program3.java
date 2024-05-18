package LinkedListExample;

// How do you join an ArrayList at the end of a LinkedList?

// Using addAll() method, we can append an ArrayList or any other Collection
// type at the end of a LinkedList.

import java.util.ArrayList;
import java.util.LinkedList;

public class Program3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("six");
        list1.add("seven");
        list1.add("eight");
        list1.add("nine");
        list1.add("ten");

        System.out.println(list1);

        //Appending arrayList at the end of linkedList

        list.addAll(list1);

        //Printing the elements of linkedList

        System.out.println(list);
    }
}
