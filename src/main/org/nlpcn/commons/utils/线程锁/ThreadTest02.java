package main.org.nlpcn.commons.utils.线程锁;

public class ThreadTest02 {
    public static void main(String[] args) {
        //创建一个公共账户
        Account account = new Account("jack", 5000);

        //创建线程
        main.org.nlpcn.commons.utils.线程锁.Processor p = new main.org.nlpcn.commons.utils.线程锁.Processor(account);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);

        t1.start();
        t2.start();
    }
}

class Processor implements Runnable {

    Account act;

    // 通过构造方法共享一个账户
    public Processor(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        try {
            act.withdraw(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

