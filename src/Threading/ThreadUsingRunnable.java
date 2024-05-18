package Threading;

public class ThreadUsingRunnable implements Runnable{
    public static void main(String[] args) {
        ThreadUsingRunnable tr = new ThreadUsingRunnable();
        Thread thread = new Thread(tr);
        thread.start();
      /*  if (thread instanceof Runnable){
            //true or false
        }*/
    }
    @Override
    public  void run(){
        for (int i=0; i<5; i++){
            System.out.println("Printing this message");
        }
    }
}
