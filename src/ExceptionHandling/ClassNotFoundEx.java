package ExceptionHandling;
//classnotfoundexception
public class ClassNotFoundEx {
    public static void main(String[] args) {
        Class cls = null;
        try{
            cls =Class.forName("ExceptionHandling.ExcetionTest");
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        ExceptionTest obj = null;
        try {
            try {
                obj=(ExceptionTest)
                        cls.newInstance();
            } catch (java.lang.InstantiationException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException e){
            throw new RuntimeException(e);
        }
        System.out.println("Testing exception");
        System.out.println(obj.name);
    }
}
