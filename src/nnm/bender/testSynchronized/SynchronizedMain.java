package nnm.bender.testSynchronized;

public class SynchronizedMain {
    public static void main(String[] args) throws InterruptedException {
        CallMe target = new CallMe();
        Caller obj1 = new Caller("Добро пожаловать1", target);
        Caller obj2 = new Caller("Добро пожаловать2", target);
        Caller obj3 = new Caller("Добро пожаловать3", target);
        Caller obj4 = new Caller("Добро пожаловать4", target);
        Caller obj5 = new Caller("Добро пожаловать5", target);
        obj1.mThread.join();
        obj2.mThread.join();
        obj3.mThread.join();
        obj4.mThread.join();
        obj5.mThread.join();

    }
}
