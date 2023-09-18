package Thread.way3_Callable;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //多线程第三种实现方式
        //特点：可以获取到多线程运行的结果
        //1.创建一个类MyCallable实现Callable接口
        //2.重写call（是有返回值的，表示多线程运行的结果）
        //3.创建MyCallable的对象（表示多线程要执行的任务）
        //4.创建FutureTask的对象（作用管理多线程运行的结果）
        //5.创建Thread类的对象并启动（表示线程）
        MyCallable myCallable=new MyCallable();
        FutureTask<Integer> futureTask=new FutureTask<>(myCallable);
        Thread thread=new Thread(futureTask);
        thread.start();
        //获取多线程执行的结果
        Integer result=futureTask.get();
        System.out.println(result);
    }
}
