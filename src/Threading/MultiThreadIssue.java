package Threading;

public class MultiThreadIssue extends Thread {
    // large scale application => production issue => debugging is very difficult
    // developers => Windows
    // Unix
    // no of cores =>
    public static void main(String[] args) {
        /*int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("cores available in my laptop" +cores);*/
        MultiThreadIssue t1 = new MultiThreadIssue();
        MultiThreadIssue t2 = new MultiThreadIssue();
        t1.setName("T1");
        t2.setName("T2");
        // 100 thread 1-100 t1 t2 t3 1000
        // Thread scheduler => runs on = OS (round robin)
        t1.start();
        t2.start();
    }

    @Override
    public synchronized void run() {
        // synchronized (this) {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Counter is" + i + "name is " + Thread.currentThread().getName());
                Thread.sleep(2000);  // sleep it just delay thread execution
                // but we use wait method for thread communication
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // }
        }
    }

    public synchronized void run22() {
        //synchronized (this){
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Counter is" + i + "name is " + Thread.currentThread().getName());
                Thread.sleep(2000); // sleep it just delay thread execution
                // But we use wait method for thread communication
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // }
    }
}

