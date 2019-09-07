package main.org.nlpcn.commons.utils.线程锁;

/*
 *   t1线程和t2线程
 *   异步编程模型：t1线程执行t1的，t2线程执行t2的，两个线程之间谁也不等谁的
 *   同步编程模型：t1线程和t2线程执行，当t1线程必须等t2线程执行结束之后t1线程才能执行
 *
 *   什么时候要同步呢？为什么要引入线程同步呢？
 *      1、为了数据安全，暂时不考虑效率
 *   什么条件下要使用线程同步？
 *      1、必须是多线程环境
 *      2、多线程环境共享同一个数据
 *      3、共享的数据涉及到修改操作
 * */

// 模拟账号的读取
/*
public class ThreadTest01 {
    public static void main(String[] args) {
        //创建一个公共账户
        Account account = new Account("jack", 5000);

        //创建线程
        Processor p = new Processor(account);
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
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}*/
