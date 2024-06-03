package Java8.LambdaExpression;

interface Sayable2{
    String say(String message);
}
public class MultipleStatement {
    public static void main(String[] args) {

        Sayable2 person = (message)->{
            String str = "I would like to say,";
            String str1 = str + message;
            return str1;
        };
        System.out.println(person.say("time is precious"));
    }
}
