package nnm.bender.testSynchronized;

public  class CallMe {
    final String a = "ad";

    public final void write(){
        System.out.println("jj");
        final int a =2;
    }


    synchronized protected void call(String msg) {
        System.out.print("[");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(msg + "]");
    }
}
