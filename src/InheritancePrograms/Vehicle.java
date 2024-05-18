package InheritancePrograms;

class Company {
    void test(){
        System.out.println("Their are many types of the company");
    }
}

class Car extends Company{
    void test1(){
        System.out.println("Cars have many types");
    }
}

class Tesla extends Car{

}

class Rangerover extends Car{

}

class Landrover extends Car{

}

class Hummer extends Car{

}

public class Vehicle extends Car{
    public static void main(String[] args){
                    Vehicle v = new Vehicle();
                    v.test1();
                    v.test();
    }
}
