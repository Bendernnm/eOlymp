package nnm.bender.testSynchronized;

public class Caller implements Runnable {
    private String mMsg;
    protected CallMe mTarget;
    Thread mThread;

    public Caller(String msg, CallMe target) {
        mMsg = msg;
        mTarget = target;
        mThread = new Thread(this, "caller");
        mThread.start();
    }

    @Override
    public void run() {
        synchronized (mTarget) {
            mTarget.call(mMsg);
        }
    }
}
