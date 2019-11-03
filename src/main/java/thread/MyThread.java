package thread;

public class MyThread extends Thread {
    //volatile
    private  boolean running = true;
    @Override
    public void run() {
        System.out.println("子线程开始");
        while (running){

        }
        System.out.println("子线程结束");
    }
    public void changeRunning(boolean running){
        this.running=running;
    }

    /**
     * 主线程执行代码会分配一块内存，执行中间创建一个新线程
     * 新线程会分配一块另外的空间，JDK1.5之后对线程进行优化，直接复制主线程的变量放在子线程中
     * 这样会导致子线程中对主线程中的变量不可见
     * 加上 volatile 关键字之后会所有线程可见
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread m1 = new MyThread();
        m1.start();
        //sleep(1000);
        m1.changeRunning(false);
        System.out.println("线程结束");
        m1.start();
    }
}
