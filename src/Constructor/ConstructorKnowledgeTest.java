package Constructor;

class A11{
    public A11(){
        System.out.println("This is default constructor of A11 class");
    }
}
class A22 extends A11{
    public A22(){

    }
    public A22(String a){
        System.out.println("This is default constructor of A22 class");
    }
}
class A33 extends A22{

}

public class ConstructorKnowledgeTest {
    public static void main(String[] args){
        A22 a = new A22("java");
    }
}
