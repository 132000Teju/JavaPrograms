package LinkedListExample;

// How do you add an element or collection of elements at a specific position of a LinkedList?

// You have to use add(int index, E element) to add an element at specific position of a
// LinkedList and to add collection of elements at specific position, use addAll(int index,
// Collection c) where ‘c’ is a collection of elements to add.

import java.util.LinkedList;

public class Program6 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.add(2,100);

        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        list1.addFirst(4);

        System.out.println(list1);

        list.addAll(3,list1);

        System.out.println(list);
    }
}
