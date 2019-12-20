package main.org.nlpcn.commons.utils.线程锁;

/**
 * Created by slade on 2019/12/6.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadNewCached {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("hello world !");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        System.out.println(" ===> main Thread execute here ! ");
    }
}
