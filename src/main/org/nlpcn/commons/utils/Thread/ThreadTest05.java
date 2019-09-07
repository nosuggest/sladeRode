package main.org.nlpcn.commons.utils.Thread;

public class ThreadTest05 {
    public static void main(String[] args) {
        Thread t1 = new Processor2();
        t1.start();
    }
}

class Processor2 extends Thread {

    //Thread的run方法不抛出异常，重写的新方法不能抛出更大范围的异常
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                //阻塞线程
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}