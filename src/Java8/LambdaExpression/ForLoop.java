package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Huda");
        list.add("Teju");
        list.add("Nisha");
        list.add("Sonali");

        list.forEach((n)-> System.out.println(n));
    }
}
