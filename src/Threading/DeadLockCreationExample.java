package Threading;

// when it occurs => better  to give example
// how can we resolve the deadlock situation => propose the solution
public class DeadLockCreationExample extends Thread{
    // creating diffrernt resources R1 and R2
    // Resource can be anything like an object of a class
    final static String R1 = "Hello Welcome to Scalar!";
    final static String R2 = "Visit Scalar!";

    public static void main(String[] args) {
        // creating thread T1
        Thread T1 = new Thread(){
            // implementing run method
            public void run(){
                // thread T1 locking the R1 resource
                synchronized (R1){
                   // System.out.println("Thread T1 locked => Resource R1");
                    System.out.println(" Line no 19");
                    // thread T1 locking the R2 resource
                    synchronized (R2){
                     //   System.out.println("Thread T1 locked => Resource R2");
                        System.out.println(" Line no 23");
                    }
                }
            }
        };
        // creating thread T2
        Thread T2 = new Thread(){
            // implementing run method
            public void run(){
                // thread T2 locking the R2  resource
                synchronized (R1){
                   // System.out.println("Thread T2 locked => Resource R2");
                    System.out.println(" Line no 35");
                    // thread T2 locking the R1 resource
                    synchronized (R2){
                      //  System.out.println("Thread T2 locked => Resource R1");
                        System.out.println(" Line no 39");
                    }
                }
            }
        };
        DeadLockCreationExample d1 = new DeadLockCreationExample();
        DeadLockCreationExample d2 = new DeadLockCreationExample();
        // starting both the thread
        d1.start();
        d2.start();
    }
    @Override
    public void run(){
        synchronized (R1){
           // System.out.println("Thread T2 locked => Resource R2");
            System.out.println(" Line no 54");
            // thread T2 locking the R1 resource
            synchronized (R2){
               // System.out.println("Thread T1 locked => Resource R1");
                System.out.println(" Line no 58");
            }
        }
    }
}
