package Overriding;

class ABC {
    void show() {
        System.out.println("This is default method");
    }
}
class EFG {
    public void show() {
        System.out.println("This is public method");
    }
}
class KLM{
    private void show(){
        System.out.println("This is private method");
    }
}
class XYZ extends ABC{
    @Override
    void show() {
        System.out.println("This is default method");
    }

}
public class RuleNo8 {

    public static void main(String[] args){

    }


}
