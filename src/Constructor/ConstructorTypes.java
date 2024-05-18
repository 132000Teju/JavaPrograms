package Constructor;

public class ConstructorTypes {
    // Default constructor
    public ConstructorTypes(){
        System.out.println("This is default constructor");
    }
    // Parameterized constructor
    public ConstructorTypes(String name,int age){
        System.out.println("This is parameterized constructor"+name+" and age is "+age);
    }
    public static void main(String[] args){
        ConstructorTypes obj = new ConstructorTypes(); //we call default constructor
        ConstructorTypes objjj = new ConstructorTypes("java",100);//we call parameterized constructor
    }
}
