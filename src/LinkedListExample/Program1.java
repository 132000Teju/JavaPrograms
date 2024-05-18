package LinkedListExample;

// Given an element, how do you find out whether that element exist in a LinkedList or not.
// If it exist retrieve the position of that element?

// First use contains() method to check whether LinkedList contains the given element or not.
// If it contains, retrieve it’s position using indexOf() method.

import java.util.LinkedList;

public class Program1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("addition");
        list.add("substract");
        list.add("multiplication");
        list.add("division");
        list.add("module");

        System.out.println(list);
        String s = "division";

        //Checking whether list contains "JSP"

        boolean contains = list.contains(s);

        if (contains){
            //If list contains "JSP", printing it's index
            System.out.println(list.indexOf(s));
        }

        //Checking whether list contains "STRUTS"
        s = "STRUTS";
        contains = list.contains("STRUTS");

        if (contains){
            //If list contains "STRUTS", printing it's index
            System.out.println(list.indexOf(s));
        }
    }
}
