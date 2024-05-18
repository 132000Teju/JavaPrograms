package Java8;

import java.util.Arrays;
import java.util.List;

public class MapMethodExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,6,9,12,15);

        // using stream map(function mapper) and
        // displaying the corresponding new stream

        list.stream().map(n -> n * 3).forEach(System.out::println);

        // map() is like simple java function which takes input, perform some action and
        // then returns some output

        // int map(int a,int b){ return (a+b)*2;}
    }
}
