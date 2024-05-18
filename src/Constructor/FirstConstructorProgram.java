package Constructor;

public class FirstConstructorProgram {
    public FirstConstructorProgram(){
        System.out.println("This is constructor in java");
    }
    public void test(){

    }
    public int FirstConstructorProgram(){
        System.out.println("This is method in java");
        return 1;
    }
    public static void main(String[] args){
        FirstConstructorProgram obj = new FirstConstructorProgram();
        obj.test();
    }
}
