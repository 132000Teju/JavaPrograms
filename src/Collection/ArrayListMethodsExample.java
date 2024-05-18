package Collection;

import java.util.ArrayList;

public class ArrayListMethodsExample {
        public static void main(String[] args) {
            // Creating an ArrayList
            ArrayList<String> fruits = new ArrayList<>();

            // Adding elements to the ArrayList
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Orange");
            fruits.add("Mango");
            System.out.println("ArrayList after adding elements: " + fruits);

            // Accessing elements using get() method
            System.out.println("Element at index 1: " + fruits.get(1));

            // Updating an element
            fruits.set(2, "Grapes");
            System.out.println("ArrayList after updating: " + fruits);

            // Removing an element
            fruits.remove("Apple");
            System.out.println("ArrayList after removing 'Apple': " + fruits);

            // Checking if an element exists
            System.out.println("Does 'Mango' exist? " + fruits.contains("Mango"));

            // Getting the size of the ArrayList
            System.out.println("Size of ArrayList: " + fruits.size());

            // Clearing the ArrayList
            fruits.clear();
            System.out.println("ArrayList after clearing: " + fruits);

            // Checking if ArrayList is empty
            System.out.println("Is ArrayList empty? " + fruits.isEmpty());
        }
    }


