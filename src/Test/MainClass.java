package Test;
class A{
}
class B extends A{
}
class C extends B{
}
public class MainClass {
    static void overloadedMethod(A a){
        System.out.println("One");
    }
    static void overloadedMethod(B b){
        System.out.println("Two");
    }
    static void overloadedMethod(Object obj)
    {
        System.out.println("THREE");
    }
    public static void main(String[] args){
        C c = new C();
       overloadedMethod(c);
        }
}
