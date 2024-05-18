package Threading;

// when it occurs => better to give example
// how can we resolve the deadlock situation => propose the solution
// resource can be anything like object of a class
public class DeadlockCreateExample  extends Thread{
    // creating different resources R1 and R2
    final static String R1 = "Java";
    final static String R2 = "Programming";

    public static void main(String[] args) {
        // creating thread T1
        Thread T1 = new Thread(){
            // implementing run method
            public void run(){
                // thread T1 locking the R1 resource
                synchronized (R1){
                    System.out.println("Thread T1 locked => Resource R1");
                    // thread T1 locking the R2 resource
                    synchronized (R2){
                        System.out.println("Thread T1 locked => Resource R2");
                    }
                }
            }
        };
        // creating thread T2
        Thread T2 = new Thread(){
            // implementing run method
            public void run(){
                // thread T2 locking the R1 resource
                synchronized (R1){
                    System.out.println("Thread T2 locked => Resource R1");
                    synchronized (R2){
                        System.out.println("Thread T2 locked => Resource R2");
                    }
                }
            }
        };
        // starting both the threads
        T1.start();
        T2.start();
    }
}
