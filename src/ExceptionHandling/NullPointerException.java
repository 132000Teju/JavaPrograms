package ExceptionHandling;

public class NullPointerException extends Throwable {
    public NullPointerException(String demo) {
    }

    public static void main(String[] args) {
        NullPointerException t =initt();
        t.too("Hi");
    }
    private static NullPointerException initt(){
        return null;
    }
    public void too(String s){
        System.out.println(s.toLowerCase());
    }
}
