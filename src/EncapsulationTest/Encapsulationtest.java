package EncapsulationTest;

public class Encapsulationtest {
    private int atmPin = 1234;

    private int age;
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAtmPin(){
        return atmPin;
    }

    public void setAtmPin(int atmPin){
        this.atmPin = atmPin;
    }
}

class TestEncapsulation{
    public static void main(String[] args){
          Encapsulationtest obj = new Encapsulationtest();
          obj.setAtmPin(4567);
          System.out.println(obj.getAtmPin());
          obj.setAge(25);
          System.out.println(obj.getAge() );
    }
}
