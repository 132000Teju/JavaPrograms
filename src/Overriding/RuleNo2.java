package Overriding;
class network{
      void show(){
              System.out.println("This is parent class");
      }
}

public class RuleNo2 extends network{
    public void show(){
        super.show();
        System.out.println("This is child class");
    }
    public static void main(String[] args){
     RuleNo2 obj = new RuleNo2();
     obj.show();
    }
}
