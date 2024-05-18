package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values

       HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Add key-value pairs to the HashMap
        map.put("Alice", 85);
        map.put("Bob", 90);
        map.put("Charlie", 75);
        map.put("David", 95);

        // Access and print values using keys
        System.out.println("Bob's score: " + map.get("Bob"));
        System.out.println("David's score: " + map.get("David"));

        // Check if a key exists in the HashMap
        String studentName = "Alice";
        if (map.containsKey(studentName)) {
            System.out.println(studentName + "s score: " + map.get(studentName));
        } else {
            System.out.println(studentName + " not found in the records.");
        }

        // Iterate over the HashMap using entrySet()
        System.out.println("All student scores:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove a key-value pair from the HashMap
        String studentToRemove = "Charlie";
        if (map.containsKey(studentToRemove)) {
            map.remove(studentToRemove);
            System.out.println(studentToRemove + "s record removed.");
        } else {
            System.out.println(studentToRemove + " not found in the records.");
        }

        // Display updated HashMap contents
        System.out.println("Updated student scores:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
