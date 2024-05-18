package InheritancePrograms;

class Lake{
    void lake(){
        System.out.println( "There is a small lake in front of my house.");
    }
}

class River extends Lake{
    void River(){
        System.out.println("London is on the river Thames.");
    }
}

class Sea extends River{
    void sea(){
        System.out.println("The sea is calm this morning.");
    }
}

class Ocean extends Sea{
    void ocean(){
        System.out.println("The Pacific Ocean is the largest ocean in the world.");
    }
}
public class Water {
    public static void main(String[] args){
        Sea pp = new Sea();
        Ocean o1 = new Ocean();
        o1.lake();
        o1.River();
        o1.sea();
        o1.ocean();
    }
}
