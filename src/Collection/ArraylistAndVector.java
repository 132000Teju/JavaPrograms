package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArraylistAndVector {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("Core Java");
        al.add("Advance Java");
        al.add("HTML");
        al.add("MySQL");

        // traversing arraylist element using iterator
        System.out.println("ArrayList elements are : ");
        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        // creating vector
        Vector<String> v = new Vector<>();
        v.addElement("code");
        v.addElement("element");
        v.addElement("pratice");
        v.addElement("quiz");

        // traversing vector element using enumeration
        System.out.println("\n Vector elements are :");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

    }
}