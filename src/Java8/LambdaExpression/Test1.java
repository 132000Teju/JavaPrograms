package Java8.LambdaExpression;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        al.forEach(n -> System.out.println(n));

        al.forEach(n ->{
            if (n % 3 == 0)
                System.out.println(n);
        });
    }
}
