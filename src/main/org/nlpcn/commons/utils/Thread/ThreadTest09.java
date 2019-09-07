package main.org.nlpcn.commons.utils.Thread;

public class ThreadTest09 {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Processor6());
        t.start();
        // t和主线程合并
        t.join();//t合并后变成了单线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}


class Processor6 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "---->" + i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}