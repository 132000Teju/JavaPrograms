package HashMapExample;

// Write a Java program to copy all mappings from the specified map to another map.

import java.util.HashMap;

public class Example3 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        HashMap<Integer,String> hashMap1 = new HashMap<Integer,String>();
        hashMap.put(1,"java");
        hashMap.put(2,"c++");
        hashMap.put(3,"Python");
        System.out.println("Print the first hashmap list :" +hashMap);
        hashMap1.put(4,"HTML");
        hashMap1.put(5,"css");
        hashMap1.put(6,"PHP");
        System.out.println("Print the second hashmap list :" +hashMap1);
        hashMap1.putAll(hashMap);
        System.out.println("Print all the hashmap list :" +hashMap1);
    }
}
