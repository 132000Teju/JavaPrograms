package InheritancePrograms;

class Methods{
    void methods(){
        System.out.println("Their are four types of the inheritance and they are as follow:-");
    }
}

class First extends Methods{
    void first(){
        System.out.println("Single Inheritance");
    }
}

class Second extends First{
    void second(){
        System.out.println("Multilevel Inheritance");
    }
}

class Third extends Second{
    void third(){
        System.out.println("Hierarchical Inheritance");
    }
}

class Four extends Third{
    void four(){
        System.out.println("Hybrid Inheritance");
    }
}

public class InheritanceMethods {
    public static void main(String[] args){
        Third pp = new Third();
        Four f1 = new Four();
        f1.methods();
        f1.first();
        f1.second();
        f1.third();
        f1.four();

    }
}
