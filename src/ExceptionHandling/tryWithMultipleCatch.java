package ExceptionHandling;

public class tryWithMultipleCatch {
    void test(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        try {
            tryWithMultipleCatch obj = null;
            obj.test();
            int[] arr =new int[5];
            arr[7] = 10;
            Class cls = Class.forName("tryWithMultipleCatch");
        }catch (java.lang.NullPointerException ne ){
            System.out.println("null pointer Exception");
        }
        catch (ArithmeticException ae){
            System.out.println("AME catch block");
        }catch (Exception e){
            System.out.println("Normal exception catch block");
        }
        System.out.println("Message");
    }
}
