package HashMapExample;

// Write a Java program to get a set view of the keys contained in this map.

import java.util.HashMap;
import java.util.Set;

public class Example11 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"T");
        hashMap.put(2,"N");
        hashMap.put(3,"S");
        hashMap.put(4,"P");
        hashMap.put(5,"U");

        Set keyset = hashMap.keySet();

        System.out.println("Set the key value " +keyset);
    }
}
