package Java8.LambdaExpression;

interface Sayable{
    public String say();
}
public class NoParameter {
    public static void main(String[] args) {
        Sayable s = ()->{
            return "I have nothing to say";
        };
        System.out.println(s.say());
    }
}
