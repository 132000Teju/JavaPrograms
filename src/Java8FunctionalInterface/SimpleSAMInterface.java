package Java8FunctionalInterface;

@FunctionalInterface
interface SAMTest{
    void test();
    default void display(){
        System.out.println("This is default method so we don`t need to worry");
    }
    static void dummy(){
        System.out.println("This is static method in interface");
    }
}

class imp1 implements SAMTest{
    @Override
    public void test(){
        System.out.println("imp1 class implement SAMTest");
    }
    @Override
    public void display(){
        System.out.println("imp1 class implement default method");
    }

    public static void main(String[] args) {

    }
}

class imp2 implements SAMTest{
    @Override
    public void test(){
        System.out.println("imp2 class implement");
    }
}
public class SimpleSAMInterface {
}

