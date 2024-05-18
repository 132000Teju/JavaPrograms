package ExceptionHandling;

public class AllTestException {
    void show(){
        System.out.println("Test");
    }

    public static void main(String[] args)  {
        System.out.println();
        try {
            AllTestException obj = null;
            obj.show();
        }catch (ArithmeticException ae) {
            System.out.println("We got into: " + ae.getMessage());
        }/*catch (NullPointerException ne){
            System.out.println("This is null pointer exception:" + ne.getMessage());
        }*/ catch (ArrayIndexOutOfBoundsException abc){
            System.out.println("This is array index out of bound exception" + abc.getMessage());
        }
    }
}
