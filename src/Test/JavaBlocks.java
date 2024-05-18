package Test;

public class JavaBlocks {
    static {
        System.out.println("This is static block");
    }
    JavaBlocks(){
        System.out.println("This is instance block");
    }
    {
        System.out.println("This is constructor");
    }
    public static void main(String[] args){
        System.out.println("This is main method");
        JavaBlocks obj = new JavaBlocks();
    }
}
