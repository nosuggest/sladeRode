package main.org.nlpcn.commons.utils.Thread;

public class ThreadTest07 {
    public static void main(String[] args) throws Exception {
        Prcessor04 processor4 = new Prcessor04();
        Thread thread = new Thread(processor4);
        thread.start();
        Thread.sleep(5000);
        //中断
        processor4.run = false;
    }
}


class Prcessor04 implements Runnable {
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // 如果正常则run，否则跳出
            if (run) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(i);
            } else {
                return;
            }
        }

    }
}