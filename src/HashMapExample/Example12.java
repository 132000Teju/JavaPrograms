package HashMapExample;

// Write a Java program to get a collection view of the values contained in this map.

import java.util.HashMap;

public class Example12 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Integer");
        hashMap.put(2,"String");
        hashMap.put(3,"Float");
        hashMap.put(4,"Boolean");
        hashMap.put(5,"Double");

        System.out.println("Print the value :" +hashMap.values());
    }
}
