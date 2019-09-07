package main.org.nlpcn.commons.utils.线程锁;

public class ThreadTest04 {
    public static void main(String[] args) throws Exception {
        MyClass mc = new MyClass();
        MyClass mc1 = new MyClass();
        Thread t1 = new Thread(new Processor2(mc));
        Thread t2 = new Thread(new Processor2(mc1));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);
        t2.start();

    }
}


class Processor2 implements Runnable {
    MyClass mc;

    public Processor2(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if ("t1".equals(Thread.currentThread().getName())) {
            mc.m1();
        }
        if ("t2".equals(Thread.currentThread().getName())) {
            mc.m2();
        }
    }
}


class MyClass {
    // synchronized添加到静态方法上，线程执行此类方法时会找类锁
    public synchronized static void m1() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("m1");
    }

    //不会等m1结束，因为该方法没有被synchronized修饰
    // 如果m2方法有synchronized，则m2方法要等m1方法，因为该类只有一个类锁，被任何一个方法拿走后，其他类锁只能等待
    public static void m2() {
        System.out.println("m2");
    }
}