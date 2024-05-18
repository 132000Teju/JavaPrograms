package Collection;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionTest {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("z");
        list.add("F");
        list.add("K");
        list.add("D");
        list.add("P");
        list.add("A");

        for (String s : list) {
            list.remove("F");
            list.add("T");
            list.clone();
            list.contains("U");
            System.out.println("Print the ArrayList :" + s);
            System.out.println(list);
        }

        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"Teju");
        map.put(2,"Teju");
        map.put(3,"Teju");

        System.out.println(map);
    }
}
