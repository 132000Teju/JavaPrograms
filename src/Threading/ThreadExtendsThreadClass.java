package Threading;

// 1 interface 1 abstract method => abstract class implements this interface
public class ThreadExtendsThreadClass  extends Thread{
    public static void main(String[] args) {
        ThreadExtendsThreadClass tt = new ThreadExtendsThreadClass();
        tt.setName("TestThread");
        System.out.println("Thread name "+tt.getClass());
        tt.start();    // start() internally calls run()
        //  tt.start();
          tt.run();
    }

    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Printing this message");
        }
    }
    void test(){
        System.out.println("This is test message");
    }
}
