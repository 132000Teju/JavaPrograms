package AbstractionProgramming;

abstract class India{
    void test(){
        System.out.println("Indian's people perfer to eat using hand");
    }
}

class Eat extends India{
    void show(){

    }
}
public class EatingClass {
    public static void main(String[] args){
        Eat a = new Eat();
        a.test();
    }
}
