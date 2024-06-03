package Java8.LambdaExpression;

interface Sayable1{
    public String say(String name);
}
public class SingleParameter {
    public static void main(String[] args) {

        Sayable1 s1 = (name)->{
            return "Hello" +name;
        };
        System.out.println(s1.say("World"));

        Sayable1 s2 = (name)->{
            return "Welcome" +name;
        };
        System.out.println(s2.say("Nature"));
    }
}
