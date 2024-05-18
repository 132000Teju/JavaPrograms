package AbstractionProgramming;

abstract class AbstractClass123{
    abstract void show();
    void test(){
        System.out.println("I am Waiting for the code");
    }
}

class NonAbstract extends AbstractClass123{
    @Override
    void show() {

    }
}

public class AbstractClass {
}

