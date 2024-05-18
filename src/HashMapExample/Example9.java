package HashMapExample;

// Write a Java program to create a set view of the mappings contained in a map.

import java.util.HashMap;
import java.util.Set;

public class Example9 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Teju");
        hashMap.put(2,"Huda");
        hashMap.put(3,"Nisha");
        hashMap.put(4,"Gouri");

        Set set = hashMap.entrySet();
        System.out.println("Set values : " +set);
    }
}
