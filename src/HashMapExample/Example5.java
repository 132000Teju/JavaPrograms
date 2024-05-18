package HashMapExample;

import java.util.HashMap;

// Write a Java program to check whether a map contains key-value mappings (empty) or not.
public class Example5 {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = new HashMap<String,Double>();
        hashMap.put("A",1.1);
        hashMap.put("B",2.2);
        hashMap.put("C",3.3);
        hashMap.put("D",4.4);
        hashMap.put("E",5.5);
        boolean result = hashMap.isEmpty();
        System.out.println("Hashmap is empty :" +result);
        hashMap.clear();
        result =hashMap.isEmpty();
        System.out.println("Hashmap is empty :" +result);
    }
}
