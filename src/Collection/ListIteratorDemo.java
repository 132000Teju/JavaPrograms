package Collection;

// ListIterator can help to replace an element whereas Iterator cannot.

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        System.out.println("Elements of ArrayList: ");
        for (Integer i : aList) {
            System.out.println(i);
        }
        ListIterator<Integer> l
                = aList.listIterator();
        l.next();
        l.set(80000);

        System.out.println("\nNow the ArrayList"
                + " elements are: ");
        for (Integer i : aList) {
            System.out.println(i);
        }
    }
}
