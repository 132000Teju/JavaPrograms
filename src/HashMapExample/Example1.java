package HashMapExample;

// Write a Java program to associate the specified value with the specified key in a HashMap.

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"Black");
        hashMap.put(2,"White");
        hashMap.put(3,"Red");
        hashMap.put(4,"Blue");
        hashMap.put(5,"Gray");
        for (Map.Entry x:hashMap.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
