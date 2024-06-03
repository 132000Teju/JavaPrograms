package Java8.LambdaExpression;

interface Drawable{
    public void draw();
}
public class WithoutLambda {
    public static void main(String[] args) {
        int Width = 10;

        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " +Width);
            }
        };
        d.draw();
    }
}
