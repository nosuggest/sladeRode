package main.org.nlpcn.commons.utils.Thread;
/*线程优先级*/
public class ThreadTest04 {
    public static void main(String[] args) {
        //如何获取当前线程对象
        Thread t = Thread.currentThread();

        // 获取线程名字
        System.out.println(t.getName());
        Processor1 processor = new Processor1();
        Thread thread = new Thread(processor);
        thread.start();
    }
}

class Processor1 implements Runnable{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}