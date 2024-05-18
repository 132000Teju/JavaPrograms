package InheritancePrograms;

class Circle{
    public void show(){
        System.out.println("Their are many shapes in the mathematical field that is one : Circle");

    }
     void test(){
        Circle circle = new Circle();
        circle.show();
     }
}

public class Shape extends Circle{
    public static void main(String[] args){
        Shape t = new Shape();
        t.show();
    }
}
