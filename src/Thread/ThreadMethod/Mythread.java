package Thread.ThreadMethod;

public class Mythread extends Thread{
    public Mythread() {
    }

    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
        super.run();
    }
}
