package ExceptionHandling;

public class ThrowException {
    static  void test() throws NullPointerException {
        try{
            throw new NullPointerException("");
        }catch (NullPointerException ab){
            System.out.println("Caught inside test()");
            throw ab;
        }
    }
    public static void main(String[] args) {
       // System.out.println(1/0);
        try {
            test();
        }catch (NullPointerException ab){
            System.out.println("Caught inside main()");
        }
    }
}
