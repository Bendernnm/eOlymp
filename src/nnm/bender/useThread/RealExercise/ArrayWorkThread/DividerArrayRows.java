package nnm.bender.useThread.RealExercise.ArrayWorkThread;

public class DividerArrayRows implements Runnable {
    private int[] mInts;
    private int divider;
    private Thread mThread;

    public DividerArrayRows(int[] ints, int divider) {
        mInts = ints;
        this.divider = divider;
        mThread = new Thread(this, "divider");
        mThread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < mInts.length; i++) {
            mInts[i] /= divider;
        }
    }

    public void join() throws InterruptedException {
        mThread.join();
    }
}
