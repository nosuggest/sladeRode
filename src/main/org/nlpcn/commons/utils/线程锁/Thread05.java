package main.org.nlpcn.commons.utils.线程锁;

/**
 * Created by slade on 2019/12/6.
 */
public class Thread05 {
    public static void main(String[] args) {
        new Thread(new MyThread()).start();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Thread(new MyThread1()).start();
    }


static class MyThread implements Runnable {
    @Override
    public void run() {
        synchronized (Thread05.class) {
            System.out.println("my thread is running");
            try {
//                Thread.sleep(1000);
                Thread05.class.wait(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("my thread is over");
        }

    }
}


static class MyThread1 implements Runnable{
    @Override
    public void run() {
        synchronized (Thread05.class) {
            System.out.println("my thread1 is running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("my thread1 is over");
        }
    }
}
}