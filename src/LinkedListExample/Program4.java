package LinkedListExample;

// Write a Java program which implements LinkedList as a Queue (FIFO)?

// Use the offer() and poll() methods which make LinkedList to work as a Queue.

import java.util.LinkedList;

public class Program4 {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        //adding the elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println(queue);

        //Removing the elements from the queue
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
