package ExceptionHandling;
//arithmeticexception
public class MoreSimpleExceptionTest {
    void test(){
        display();
    }
    void display(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        MoreSimpleExceptionTest test = new MoreSimpleExceptionTest();
        test.test();
        System.out.println("First line to be executed");
        int a = 100/0;
        System.out.println("Last line to be executed");
    }
}
