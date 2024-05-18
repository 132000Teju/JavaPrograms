package StaticProgramming;

import java.lang.reflect.Constructor;

public class JavaBlockConcept {
    void test(){
        System.out.println("This is method");
    }
    public JavaBlockConcept(){
        System.out.println("This is constructor");
    }
    {
        System.out.println("This is an instance block");
    }
    static {
        System.out.println("This is a static block");
    }
    public static void main(String[] args){
        System.out.println("This is main method");
        JavaBlockConcept obj = new JavaBlockConcept();
        JavaBlockConcept obj1 = new JavaBlockConcept();
    }
}
