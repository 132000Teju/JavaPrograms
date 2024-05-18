package ObjectClassMethod;

public class GetClassExample {
        public static void main(String[] args) {
            String str = "Hello";
            Integer num = 10;
            MyClass myObj = new MyClass();

            // Using getClass() method
            System.out.println("Class of str: " + str.getClass().getName());
            System.out.println("Class of num: " + num.getClass().getName());
            System.out.println("Class of myObj: " + myObj.getClass().getName());
        }
    }

    class MyClass {
        // Class definition
    }


