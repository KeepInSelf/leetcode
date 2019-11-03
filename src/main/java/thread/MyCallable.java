package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Boolean> {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask<Boolean> task = new FutureTask<>(myCallable);
        new Thread(task,"线程1").start();

        System.out.println(111);
        Boolean aBoolean = task.get();//task会阻塞线程
        System.out.println(aBoolean);
        System.out.println(222);
    }

    @Override
    public Boolean call() throws Exception {
        Thread.sleep(1000);
        System.out.println("线程中");
        return true;
    }
}
