package StaticProgramming;

public class VariableConcept {
    // Static variable declaration
    static int staticVar = 0;

    // Instance variable declaration
    int instanceVar;

    public VariableConcept(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    public static void main(String[] args) {
        // Create instances of MyClass
        VariableConcept obj1 = new VariableConcept(10);
        VariableConcept obj2 = new VariableConcept(20);

        // Access static variable using class name
        VariableConcept.staticVar = 100;

        // Access instance variable using object reference
        obj1.instanceVar = 50;

        // Print the values of both variables
        System.out.println("Static variable: " + VariableConcept.staticVar);
        System.out.println("Instance variable of obj1: " + obj1.instanceVar);
        System.out.println("Instance variable of obj2: " + obj2.instanceVar);
    }
}
