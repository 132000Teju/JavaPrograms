package LinkedListExample;

// Write a Java program to traverse the elements of a LinkedList in reverse direction?

// This can be done using descendingIterator() method which returns an Iterator object
// containing all elements of a LinkedList in the reverse order i.e from tail to head.

import java.util.Iterator;
import java.util.LinkedList;

public class Program2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("addition");
        list.add("subtract");
        list.add("multiplication");
        list.add("division");
        list.add("module");

        System.out.println(list);

        //Getting the Iterator object using descendingIterator() method

        Iterator<String> itr = list.descendingIterator();

        //printing the elements of list in reverse order

        while (itr.hasNext()){
            System.out.println("Reverse direction : " +itr.next());
        }

    }
}
