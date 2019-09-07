package main.org.nlpcn.commons.utils.Thread;

/*
 *   Thread.yield()
 *   1.该方法是一个静态方法
 *   2.作用：给同一个优先级的线程让位，让位时间不固定
 *   3.和sleep方法相同，就是时间不固定
 * */

public class ThreadTest08 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Processor5());
        thread.start();

        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }

    }
}


class Processor5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            if (i % 2 == 0) {
                Thread.yield();
            }
        }
    }
}