package HashMapExample;

//  Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"Black");
        hashMap.put(2,"White");
        hashMap.put(3,"Red");
        hashMap.put(4,"Blue");
        hashMap.put(5,"Gray");
        System.out.println(" Size of the hash map : "+hashMap.size());
    }
}
