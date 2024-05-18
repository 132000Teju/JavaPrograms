package ExceptionHandling;

public class TryWithFinally {
    public static void main(String[] args) {
        try {
            int a =100/0;
        }catch (Exception e){
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally block");
        }
        int b = 100/0;
        System.out.println("Message");
    }
   /* try{

    }catch(Exception e){

    }
    try{

    }*/
}
