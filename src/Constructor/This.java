package Constructor;
class college{
    public college(){
        this("j");
        System.out.println("Welcome to the college");
    }
    public college(String a){
        this(12);
        System.out.println("Student name in the college");
    }
    public college(int a){
        System.out.println("Roll number of the student");
    }
}
/*class abc extends college{ public abc(){
        //this(true);
        System.out.println("java numbers");
    }
}*/

public class This {
    public static void main(String[] args){
        college a = new college();
    }
}
