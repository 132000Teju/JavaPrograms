package BasicJavaProgramms;

class Dummy{
    void test(){
        System.out.println("This is Dummy class's method" );
    }
}

public class CreateObjectInOtherClass {
    public static void main(String[] args){
        Dummy dd = new Dummy();
        dd.test();
    }
}
