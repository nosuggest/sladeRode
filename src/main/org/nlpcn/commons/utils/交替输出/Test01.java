package main.org.nlpcn.commons.utils.交替输出;

/*
 *   两个线程共同对一个共享数据操作
 * */

public class Test01 {
    public static void main(String[] args) throws Exception {
        Num num = new Num(1);
        Thread t1 = new Thread(new ProcessorOdd(num));
        t1.setName("t1");
        Thread t2 = new Thread(new ProcessorOdd(num));
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}

// 共享数据
class Num {
    int count;

    public Num(int count) {
        this.count = count;
    }

    public synchronized void printOdd() throws Exception {
        System.out.println(Thread.currentThread().getName() + "------------>" + count++);
        this.notifyAll();
        this.wait();// t1线程无期限的等待
    }

    public synchronized void printEven() throws Exception {
        System.out.println(Thread.currentThread().getName() + "------------>" + count++);
        this.notifyAll();//唤醒其他线程，但是对象锁在printEven手上，所以需要等待当前方法结束
        this.wait();
    }

}

// 线程1
class ProcessorOdd implements Runnable {
    Num num;

    public ProcessorOdd(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                num.printOdd();
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}

class ProcessorEven implements Runnable {
    Num num;

    public ProcessorEven(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                num.printEven();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}