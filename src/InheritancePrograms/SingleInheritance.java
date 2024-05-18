package InheritancePrograms;

class ABCD{
    public void show(){
        System.out.println("Show method will run");
    }
    void test(){
        ABCD abcd = new ABCD();
        abcd.show();
        show();
    }
}
public class SingleInheritance extends ABCD {
    public static void main(String[] args){
        SingleInheritance t = new SingleInheritance();
        t.show();
    }
}
class Test{
    void accessPublicMethod(){
        ABCD abcd = new ABCD();
        abcd.show();
    }
}
