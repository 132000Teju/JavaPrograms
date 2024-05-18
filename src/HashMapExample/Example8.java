package HashMapExample;

// Write a Java program to test if a map contains a mapping for the specified value.

import java.util.HashMap;

public class Example8 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Red",1);
        hashMap.put("Yellow",2);
        hashMap.put("Black",3);
        hashMap.put("White",4);
        hashMap.put("Blue",5);
        System.out.println("The original hashmap :" +hashMap);

        System.out.println("1. The key is Black ");
        if (hashMap.containsKey("Black")){
            System.out.println("Yes!" );
        }else {
            System.out.println("No!" );
        }

        System.out.println("2. The key is Rose");
        if (hashMap.containsKey("Rose" )){
            System.out.println("Yes!" );
        }else {
            System.out.println("No!" );
        }
    }
}
