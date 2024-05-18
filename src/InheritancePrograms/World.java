package InheritancePrograms;

class Country{
    void country(){
        System.out.println("India is my country.");
    }
}

class State extends Country{
    void state(){
        System.out.println(" State is Maharashtra.");
    }
}

class District extends State{
    void district(){
        System.out.println(" District is Solapur.");
    }
}

class Taluka extends District{
    void taluka(){
        System.out.println("Taluka is Pandhapur.");
    }
}
public class World {
    public static void main(String[] args){
        District pp = new District();
        Taluka t1 = new Taluka();
        t1.country();
        t1.state();
        t1.district();
        t1.taluka();
    }
}
