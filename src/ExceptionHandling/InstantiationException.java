package ExceptionHandling;


public class InstantiationException extends Throwable {
    public static void main(String[] args) {
        try {
            Class<Boolean> booleanClass = boolean.class;
            Boolean booleanInstance = booleanClass.newInstance();
            System.out.println("booleaninstance" + booleanInstance);
        }catch( IllegalAccessException | java.lang.InstantiationException e){
            e.printStackTrace();
        }
    }
}
