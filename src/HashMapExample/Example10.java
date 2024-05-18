package HashMapExample;

// Write a Java program to get the value of a specified key in a map.

import java.util.HashMap;

public class Example10 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"P");
        hashMap.put(2,"Q");
        hashMap.put(3,"R");
        hashMap.put(4,"S");
        hashMap.put(5,"T");

        String val = (String) hashMap.get(1);

        System.out.println("Key value is :" +val);
    }
}
