package nnm.bender;

public class SummThread implements Runnable {

    private Thread mThread;
    private double summ;

    public SummThread() {
        mThread = new Thread(this,"summ");
        mThread.start();
    }

    public double getSumm() throws InterruptedException {
        mThread.join();
        return summ;
    }

    @Override
    public void run() {
        try {
            summ = Main.summ();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
