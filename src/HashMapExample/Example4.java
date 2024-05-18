package HashMapExample;

import java.util.HashMap;

// Write a Java program to remove all mappings from a map.
public class Example4 {
    public static void main(String[] args) {
        HashMap<Integer,Float> hashMap = new HashMap<Integer, Float>();
        hashMap.put(1,11.1f);
        hashMap.put(2,22.2f);
        hashMap.put(3,33.3f);
        hashMap.put(4,44.4f);
        hashMap.put(5,55.5f);
        System.out.println("The original hashmap :" +hashMap);
        hashMap.clear();
        System.out.println("The new hashmap :" +hashMap);
    }
}
