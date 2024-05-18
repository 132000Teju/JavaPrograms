package Constructor;
class A1{
    public A1(){
        System.out.println("This is super keyword function");
    }
}
class A2 extends A1{
    public A2(){
        System.out.println("This is default constructor");
    }
    public A2(String a){
        System.out.println("This is single parameterized constructor"+a);
    }
    public A2(String b,int a,boolean c){
        System.out.println("This is multiple parameterized constructor");
    }
}
class A3 extends A2{
    public A3(){
        super("java");
        System.out.println("Calling the multiple parameterized constructor");
    }
}


public class Super {
    public static void main(String[] args){
        A3 a = new A3();
    }
}
