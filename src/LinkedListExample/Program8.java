package LinkedListExample;

// How do you replace an element at a specific position of a LinkedList with the given element?

// To replace an element at specific position of a LinkedList , use set() method.

import java.util.LinkedList;

public class Program8 {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        System.out.println(list);

        list.set(0,"Zero");

        System.out.println(list);
    }
}
