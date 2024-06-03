package Java8.LambdaExpression;

interface Addable1{
    int add(int a,int b);
}
public class WithOrWithoutReturnKeyword {
    public static void main(String[] args) {

        // Lambda expression without return keyword
        Addable1 a1 = (a,b)->(a+b);
        System.out.println(a1.add(10,20));

        // Lambda expression with return keyword
        Addable1 a2 = (int a,int b)->{
            return (a+b);
        };
        System.out.println(a2.add(10,200));
    }
}
