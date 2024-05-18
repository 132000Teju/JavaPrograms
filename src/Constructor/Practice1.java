package Constructor;
class ABC{
    public ABC(){
        System.out.println("This is first program");
    }
}
class XYZ extends ABC{
    public XYZ(){

    }
    public XYZ(int a){
        System.out.println("That is the second line");

    }
}

public class Practice1 {
    public static void main(String[] args){
        XYZ a = new XYZ(10);
    }
}
