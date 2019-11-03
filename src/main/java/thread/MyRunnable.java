package thread;

public class MyRunnable implements Runnable {
    public volatile  boolean running=true;
    @Override
    public  void run() {

        try {
            Thread.sleep(1000);
            running=false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyRunnable  myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.start();
        //主线程开始
        System.out.println("主线程开始");
        while (myRunnable.running){

        }
        //主线程结束
        System.out.println("主线程结束");
    }
}
