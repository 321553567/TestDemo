package Thread.way2_Runnable;

public class MyRun implements Runnable {
    @Override
    public void run() {
        //书写线程中要执行的代码
        //先获取到当前线程的对象
        for (int i = 0; i <100 ; i++) {
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+"Hello");
        }

    }
}
