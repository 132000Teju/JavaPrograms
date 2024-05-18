package Threading;

// performing single task from multiple thread

public class Test1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Task");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.start();
        Test1 t1 = new Test1();
        t1.start();
    }
}
