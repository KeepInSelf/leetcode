package thread;

import java.util.Random;
import java.util.concurrent.FutureTask;

public class LambdaCallable {
    public static void main(String[] args) {
        new FutureTask<Integer>(()->new Random().nextInt());
    }
}
