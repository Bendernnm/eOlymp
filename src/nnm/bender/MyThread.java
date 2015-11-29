package nnm.bender;

public class MyThread implements Runnable {
    private static int id = 1;
    private Thread mThread;
    private int thisThreadId;

    public MyThread(){
        mThread = new Thread(this,"My thread ["+id+"].");
        thisThreadId = id;
        id++;
        System.out.println("Поток "+mThread+"создан.");
        mThread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Поток ["+mThread+"] ping:"+i);
            try {
                Thread.sleep(thisThreadId*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Поток ["+mThread+"] end");
    }

    public void join() throws InterruptedException {
        mThread.join();
    }
}
