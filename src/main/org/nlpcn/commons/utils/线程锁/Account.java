package main.org.nlpcn.commons.utils.线程锁;


//synchronized是对象锁！！！！！！！！！！！！！！！！！！！！！！！！！！
public class Account {
    private String actno;
    private double balacne;

    public Account() {
    }

    public Account(String actno, double balacne) {
        this.actno = actno;
        this.balacne = balacne;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalacne() {
        return balacne;
    }

    public void setBalacne(double balacne) {
        this.balacne = balacne;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno='" + actno + '\'' +
                ", balacne=" + balacne +
                '}';
    }

    //synchronized 加在成员方法上，线程也拿走的this的对象锁
    public synchronized void withdraw(double money) {
//    public void withdraw(double money) {
        //把需要同步的代码放到同步语句块中
        //t1线程执行到此处，遇到synchronized关键字，就会去找this的对象锁
        //如果找到this对象锁，则进入同步语句块状中执行程序；当同步语句块中的
        //代码执行结束之后，t1线程归还this对象锁
        //t1线程执行同步语句块的过程中，如果t2线程也过来执行以下代码，也遇到synchronized
        //关键词，所以也去找this对象锁，但是该对象锁被t1线程持有，只能在这边等待this对象的
        //归还

//        synchronized (this) {
        double after = balacne - money;
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.setBalacne(after);
        System.out.println(this);
//        }
    }
}
