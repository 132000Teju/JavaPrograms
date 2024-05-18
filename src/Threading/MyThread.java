package Threading;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Keep Some task here......");
    }


    public static void main(String[] args) {

        class UsageClassOne {
            void method() {
                //Using the thread and it's task

                MyThread t = new MyThread();
                t.start();
            }
        }
        class UsageClassTwo {
            void method() {
                //Using the thread and it's task

                MyThread t = new MyThread();
                t.start();
            }
        }
    }
}
