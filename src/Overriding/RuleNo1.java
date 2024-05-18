package Overriding;
class parent{
    private void a1() {
              System.out.println("This is first line");
    }
    protected void a2(){
        System.out.println("This is second line");
    }
}
class child extends parent{
    private void a1(){
           System.out.println("This is third line");
       }
      @Override
       public void a2(){
        System.out.println("This is fourth line");
       }
}
public class RuleNo1 {
    public static void main(String[] args){
         parent obj1 = new parent();
         obj1.a2();
         child obj2 = new child();
         obj2.a2();

    }
}
