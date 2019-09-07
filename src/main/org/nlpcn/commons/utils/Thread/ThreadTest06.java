package main.org.nlpcn.commons.utils.Thread;

public class ThreadTest06 {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Processor3());
        thread.start();
        Thread.sleep(1000);
        //依靠的是异常处理机制
        thread.interrupt();
    }
}


class Processor3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000000000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(Thread.currentThread().getName());
    }
}