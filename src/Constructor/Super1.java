package Constructor;
class animal{
    public animal(){
        //super();
        System.out.println("Animal is created");
    }
}
class dog extends animal{
    public dog(){
        super();
        System.out.println("Dog is created");
    }
}
class cat extends dog{
    public cat(String a){
        super();
        System.out.println("Cat is created"+a);
    }
}
public class Super1 {
    public static void main(String[] args){
        cat a = new cat("mini");
    }
}
