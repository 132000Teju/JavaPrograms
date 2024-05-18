package ExceptionHandlingWithMethodOverriding;

//If the superclass method declares an exception
// Rule 1: If the superclass method declares an exception,
// subclass overridden method can declare the same subclass exception or
//        no exception but cannot declare parent exception.
// in case subclass overridden method declares parent exception

class parent1{
    void method() throws Exception{
        System.out.println("Parent class");
    }
}
public class TestException1 extends parent1 {
    @Override
    void method()  {
        System.out.println("Child class");
//        try {
//            super.method();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void main(String[] args) throws Exception {
           parent1 p1 = new TestException1();
          /* try {
               p1.method();
           }catch (Exception e){

           }*/
        p1.method();
    }
}
