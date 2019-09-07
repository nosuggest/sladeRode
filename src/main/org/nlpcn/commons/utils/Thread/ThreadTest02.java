package main.org.nlpcn.commons.utils.Thread;

/*
 *   java实现多线程的方法1：
 *       1、继承java.lang.Thread
 *       2、重新run方法
 * */
public class ThreadTest02 {
    // 结果的内容是交替释放
    public static void main(String[] args) {
        // 创建线程
        Thread thread = new Processer();
        // 启动瞬间结束，告诉jvm再分配一个新的栈给thread线程
        // run不需要程序员手动调用，系统启动后自动调用run方法
        // 如果不调用start而是run，则没有启动其他线程，还是同一个线程
        thread.start();
        //主线程中
        for (int i = 0; i < 1000; i++) {
            System.out.println("main-->" + i);
        }
        //有了多线程之后，只是主线程栈弹空，其他线程可能依旧
        //还没有执行完成，可以继续执行
    }
}

class Processer extends Thread {
    // 重新写run方法
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("run-->" + i);
        }
    }
}