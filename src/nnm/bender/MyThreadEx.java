package nnm.bender;

public class MyThreadEx extends Thread {
    private static int id = 1;
    private int thisThreadId;

    public MyThreadEx() {
        super("My thread [" + id + "].");
        thisThreadId = id;
        id++;
        System.out.println("Поток "+this+"создан.");
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Поток ["+this+"] ping:"+i);
            try {
                Thread.sleep(thisThreadId*500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Поток [" + this + "] end");
    }
}
