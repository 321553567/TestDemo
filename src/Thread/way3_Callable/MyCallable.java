package Thread.way3_Callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    @Override
    public Integer call() throws Exception {
        //求1~100之间的和
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
