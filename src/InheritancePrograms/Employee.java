package InheritancePrograms;

class NAME{
    public void show(){
        System.out.println("Salary of the employee is : 20000");
    }
     void test(){
        NAME name = new NAME();
        name.show();
        show();
     }
}
public class Employee extends NAME{
    public static void main(String[] args){

        Employee t = new Employee();
        t.show();

    }
}
