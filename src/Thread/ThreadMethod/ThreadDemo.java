package Thread.ThreadMethod;

public class ThreadDemo {
    public static void main(String[] args) {
        Mythread t1=new Mythread("飞机");
        Mythread t2=new Mythread("坦克");
        Thread t=Thread.currentThread();
        System.out.println(t.getName());

        t1.start();
        t2.start();
    }


}
