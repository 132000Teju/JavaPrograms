package Threading;

public class DeadlockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
              //  System.out.println("Thread 1: Acquired lock on resource1");
                System.out.println(" Line no 11");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               // System.out.println("Thread 1: Waiting for lock on resource2");
                System.out.println(" Line no 18");
                synchronized (resource2) {
                   // System.out.println("Thread 1: Acquired lock on resource2");
                    System.out.println(" Line no 21");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
               // System.out.println("Thread 2: Acquired lock on resource2");
                System.out.println(" Line no 29");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               // System.out.println("Thread 2: Waiting for lock on resource1");
                System.out.println(" Line no 36");
                synchronized (resource1) {
                   // System.out.println("Thread 2: Acquired lock on resource1");
                    System.out.println(" Line no 39");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}


