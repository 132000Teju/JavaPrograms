package InheritancePrograms;

class GreatGrandParent{
    void greatGrandParent(){
        System.out.println("Great Grand Parent method called.");
    }
}

class GrandParent extends GreatGrandParent{
    void grandParent(){
        System.out.println("Grand Parend method called.");
    }
}

class Parent1 extends GrandParent{
    void parent(){
        System.out.println("Parent class method is called.");
    }
}

class Son extends Parent1{
    void son(){
        System.out.println("Son class's method is called.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args){
        Parent1 pp = new Parent1();
        Son s1 = new Son();
        s1.greatGrandParent();
        s1.grandParent();
        s1.parent();
        s1.son();
    }
}
