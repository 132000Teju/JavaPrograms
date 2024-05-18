package PraticeClassProgram;


public class Que2 {
    public static void main(String[] args) {
        double a=1;
        double b=5;
        double c=1;
        double result = b * b - 4 * a * c;
        if (result > 0) {
            double r1 = (-b + Math.sqrt(result)) / (2 * a);
            double r2 = (-b - Math.sqrt(result)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
