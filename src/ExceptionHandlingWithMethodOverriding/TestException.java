package ExceptionHandlingWithMethodOverriding;

//If the superclass method does not declare an exception

//Rule 1: If the superclass method does not declare an exception,
        //subclass overridden method cannot declare the checked exception.
//Rule 2: If the superclass method does not declare an exception,
// subclass overridden method cannot declare the checked exception but can declare unchecked exception.
class parent{
 void method(){
  System.out.println("Parent class");
 }
}
public class TestException extends parent {
 @Override
 void method() throws ArrayIndexOutOfBoundsException {
  System.out.println("Child class");
 }

 public static void main(String[] args) {
  parent p1 = new TestException();
  p1.method();
 }
}
