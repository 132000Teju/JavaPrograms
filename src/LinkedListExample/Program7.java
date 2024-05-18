package LinkedListExample;

//  How do you remove the elements of a LinkedList from both the ends?

// You can use pollLast() and removeLast() to remove the elements from the tail of a
// LinkedList and to remove the elements from the head of a LinkedList, use poll() or
// pollFirst() or remove() or removeFirst().

import java.util.LinkedList;

public class Program7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");

        System.out.println(list);

        list.poll();
        list.pollFirst();
        list.remove();
        list.removeFirst();

        System.out.println(list);

        list.pollLast();
        list.removeLast();

        System.out.println(list);
    }
}
