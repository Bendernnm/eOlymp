package nnm.bender.useThread.RealExercise.WriteFunction;

public class WriteStringThread implements Runnable {
    private Thread mThread;
    private int number;

    public WriteStringThread() {
        mThread = new Thread(this, "writeString");
        mThread.start();
    }

    public WriteStringThread(int i) {
        number = i;
        mThread = new Thread(this, "writeString:" + i);
        mThread.start();
    }

    @Override
    public void run() {
        System.out.println("work[" + number + "]");
    }

    public void join() throws InterruptedException {
        mThread.join();
    }
}
