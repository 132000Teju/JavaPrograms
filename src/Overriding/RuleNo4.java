package Overriding;
class name{
     void show(){
        System.out.println("rule number 4");
    }
}
public class RuleNo4 extends name{
   @Override
      void show(){
       super.show();
        System.out.println("This is the child class");
    }
    public static void main(String[] args){
        RuleNo4 obj = new RuleNo4();
        obj.show();
    }
}
