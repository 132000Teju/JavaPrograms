package Constructor;
class B00{
    public B00(){
        System.out.println("This is super keyword function");
    }
}
class B11 extends B00{
    public B11(){
        System.out.println("This is default constructor");
    }
    public B11(String a){
        System.out.println("This is single parameterized constructor"+a);
    }
    public B11(String b,int a,boolean c){
        System.out.println("This is multiple parameterized constructor");
    }
}
class B22 extends B11{
    public B22(){
        super("java",100,true);
        System.out.println("Calling the parameterized constructor");
    }
}
public class SuperKeywordTest {
    public static void main(String[] args){
        B22 b2 = new B22();
    }
}
