package Constructor;
class c11{
    public c11(){
        this(10);
        System.out.println("default constructor");
    }
    public c11(int a){
        this("java",false);
        System.out.println("single parameterized constructor");
    }
    public c11(String a,boolean b){

        System.out.println("parameterized constructor");
    }
}
public class ThisKeywordExample {
    public static void main(String[] args){

        c11 a = new c11(10);
    }
}
