package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class product1{
    int id;
    String name;
    float price;
    public product1(int id,String name,float price){
        super();
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class FilterCollectionData {
    public static void main(String[] args) {
        List<product1> list = new ArrayList<>();

        list.add(new product1(1,"Samsung A5",17000f));
        list.add(new product1(3,"Iphone 6S",65000f));
        list.add(new product1(2,"Sony Xperia",25000f));
        list.add(new product1(4,"Nokia Lumia",15000f));
        list.add(new product1(5,"Redmi4 ",26000f));
        list.add(new product1(6,"Lenevo Vibe",19000f));

        Stream<product1> filtered_data = list.stream().filter(p->p.price > 20000);

        filtered_data.forEach(product1 -> System.out.println(product1.name+":"+product1.price)
        );
    }
}
