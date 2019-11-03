package thread;

public class volatileTest {
    boolean flag = true;

    public static void main(String[] args) {
        new volatileTest().run();
    }

    private void run(){

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                while (flag) {
                    System.out.println(flag);
                }
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                flag = false;
                System.out.println("修改后:" + flag);
            }
        };

        new Thread(runnable).start();
        new Thread(runnable1).start();
    }
}
