package Java8.LambdaExpression;

interface FuncInterface{
     void abstractFun(int x);
     default void normalFun(){
         System.out.println("Hello");
     }
}
public class Test {
    public static void main(String[] args) {
        FuncInterface obj = (int x) -> System.out.println(3*x);
        obj.abstractFun(5);
    }
}
