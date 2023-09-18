package Thread.way2_Runnable;

public class ThreadDemo {
    public static void main(String[] args) {
        //多线程第二种启动方式
        //1.自己定义一个类来实现Runnable接口
        //2.重写里面的run方法
        //3.创建自己的类的对象
        //4.创建一个Thread类的对象，并开启线程


        //创建MyRun的对象
        // 表示多线程要执行的任务
        MyRun myRun=new MyRun();
        //创建线程对象
        Thread thread=new Thread(myRun);
        Thread thread1=new Thread(myRun);
        thread.setName("线程1");
        thread1.setName("线程2");
        thread.start();
        thread1.start();

    }
}
