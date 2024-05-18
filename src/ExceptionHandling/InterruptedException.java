package ExceptionHandling;

public class InterruptedException extends Throwable {
    public static void main(String[] args) {
        Thread longSleepingThread = new Thread(() -> {
            try {
                System.out.println("Going to sleep...");
                Thread.sleep(10000);
                Thread.currentThread().interrupt();
                System.out.println("Woke up normally!");
            } catch (java.lang.InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        longSleepingThread.start();
        try {
            Thread.sleep(2000);
        } catch (java.lang.InterruptedException e) {
            throw new RuntimeException(e);
        }
        longSleepingThread.interrupt();
    }
}
