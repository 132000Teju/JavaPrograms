package InheritancePrograms;

class Tiger{
    public void show(){
        System.out.println("Tiger is the king of the jungle.");
    }
    void test(){
        Tiger tiger = new Tiger();
        tiger.show();
    }
}

public class Animal extends Tiger {
    public static void main(String[] args){
        Animal t = new Animal();
        t.show();
    }
}
