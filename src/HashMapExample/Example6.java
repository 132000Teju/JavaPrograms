package HashMapExample;

//  Write a Java program to get a shallow copy of a HashMap instance.
import java.util.HashMap;

public class Example6 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"A");
        hashMap.put(2,"B");
        hashMap.put(3,"C");
        hashMap.put(4,"D");
        hashMap.put(5,"E");
        System.out.println("The original HashMap :" +hashMap);
        HashMap<Integer,String> newhashmap = new HashMap<Integer, String>();
        newhashmap = (HashMap)hashMap.clone();
        newhashmap.put(6,"F");
        System.out.println("This is shallow copy of the hashmap :" +newhashmap);
    }
}
