package nnm.bender.useThread.WinApi;

import java.util.Random;

public class OneThreadGeneration implements Runnable {
    private int[][][] mMatrix;
    public Thread mThread;
    private int mCount;

    public OneThreadGeneration(int[][][] matrix) {
        mMatrix = matrix;
        mThread = new Thread(this, "OneThread");
        mThread.start();
    }

    public void join() throws InterruptedException {
        mThread.join();
    }


    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < mCount; i++) {
            for (int j = 0; j < mCount; j++) {
                for (int k = 0; k < mCount; k++) {
                    mMatrix[i][j][k] = random.nextInt();
                }
            }
        }
    }

    public class Person {
        String name;

        public Person(String personName) {
            name = personName;
        }

        public String greet(String yourName) {
            return String.format("Hi %s, my name is %s", name, yourName);
        }
    }
}
