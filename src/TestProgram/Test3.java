package TestProgram;

// ClassCastException
public class Test3 {
    public static void main(String[] args) {
        Object obj = new Object();
        String str = (String)obj;
        System.out.println(str);
    }
}
