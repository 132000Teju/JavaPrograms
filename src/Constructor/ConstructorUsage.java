package Constructor;

public class ConstructorUsage {
    private String name = "java";
    private int age = 25;
    private double salary;
    private boolean test;
    public static void main(String[] args){
        ConstructorUsage usage = new ConstructorUsage();
        System.out.println("name is"+usage.name);
        System.out.println("age is"+usage.age);
        System.out.println("salary is"+usage.salary);
        System.out.println("test is"+usage.test);
    }
}
