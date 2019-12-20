package main.org.nlpcn.commons.utils.线程锁;

public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread thread = new Thread(new T1(o1, o2));
        Thread thread1 = new Thread(new T2(o1, o2));


        //死锁
        thread.start();
        thread1.start();

    }
}


class T1 implements Runnable {
    Object o1;
    Object o2;

    public T1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            System.out.println("T1 O1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            synchronized (o2) {
            System.out.println("T1 O2");
            }
        }
    }
}

class T2 implements Runnable {
    Object o1;
    Object o2;

    public T2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            System.out.println("T2 O1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            synchronized (o1) {
            System.out.println("T2 O2");
            }
        }
    }
}