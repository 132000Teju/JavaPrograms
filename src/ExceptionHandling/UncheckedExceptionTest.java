package ExceptionHandling;
// arrayindexoutofboundsexception
public class UncheckedExceptionTest {
    void test(){
        System.out.println("Test message");
    }

    public static void main(String[] args) {
        UncheckedExceptionTest obj1 = new UncheckedExceptionTest();
        UncheckedExceptionTest obj = null;
        int[] array =new int[5];
        array[0] = 5;
        array[1] = 10;
        array[2] = 15;
        array[3] = 20;
        array[4] = 25;
        array[5] = 30;
        System.out.println(array[5]);
    }
}
