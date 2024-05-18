package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);
        hashMap.put("D",4);
        hashMap.put("E",5);
        hashMap.put("F",6);
        hashMap.put("G",7);
        hashMap.put("H",8);
        hashMap.put("I",9);
        hashMap.put("J",10);

        Set<String> keyset = hashMap.keySet();
        System.out.println(keyset);

        String[] keysArray = keyset.toArray(new String[0]);
            System.out.println("Reverse order print :");
        for (int i=keysArray.length-1; i>=0; i--){
            String key = keysArray[i];
            System.out.println(hashMap.get(key));
        }



    }
}
