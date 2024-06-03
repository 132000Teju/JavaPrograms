package Java8.LambdaExpression;

public class Test2 {
    interface FuncInter1 {
        int operation(int a, int b);
    }

    interface FuncInter2 {
        void sayMessage(String message);
    }

    private int operate(int a,int b,FuncInter1 obj){
        return obj.operation(a,b);
    }

    public static void main(String[] args) {

        FuncInter1 add = (int x,int y) -> x + y;

        FuncInter1 multiply = (int x,int y) -> x * y;

        Test2 obj1 = new Test2();

        System.out.println("Addition is :" +obj1.operate(12,13,add));

        System.out.println("Multiplication is :" +obj1.operate(6,8,multiply));

        FuncInter2 obj = message -> System.out.println("Hello " +message);
        obj.sayMessage("World");
    }
}
