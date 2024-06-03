package Java8.LambdaExpression;

interface Drawable1{
    public void draw();
}
public class WithLambda {
    public static void main(String[] args) {
        int Width = 10;

        Drawable1 d1 = ()->{
            System.out.println("Drawing " +Width);
        };
        d1.draw();
    }
}
