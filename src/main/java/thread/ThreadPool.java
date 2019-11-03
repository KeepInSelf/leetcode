package thread;

import com.sun.corba.se.impl.orbutil.threadpool.WorkQueueImpl;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(1);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.execute(null);
        new ThreadPoolExecutor(1,1,0, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new WorkQueueImpl());


    }
}
