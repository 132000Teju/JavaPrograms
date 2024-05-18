package Overriding;
class type{
    int show(){
        System.out.println(" returns the parent class method ");
        return 10;
    }
}
public class RuleNo3 extends type{
    @Override
    int show(){
        super.show();
        System.out.println(" returns the child class method ");
        return 200;
    }
    public static void main(String[] args){
        RuleNo3 obj = new RuleNo3();
        obj.show();
    }
}
