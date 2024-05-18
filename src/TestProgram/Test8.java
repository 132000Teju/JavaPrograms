package TestProgram;

// InterruptedException
public class Test8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++)
            System.out.println("Value of i: " +i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello Java");
    }
}
