package main.org.nlpcn.commons.utils.Thread;

/*
 *   java中实现线程的第二种方式
 *       第一步：写一个实现java.lang.Runnable接口
 *       第二部: 实现run方法
 *
 * */
public class ThreadTest03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Processor());
        thread.start();
        for (int i = 0; i < 40; i++) {
            System.out.println(i);
        }
    }
}

// 这种方式是推荐的，在通过接口实现多线程之外，还保留了类的继承
class Processor implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            System.out.println(i);
        }
    }
}