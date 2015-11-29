package nnm.bender.useThread.WinApi;

public class Main {

    private final static int COUNT = 1000;

    public static void main(String[] args) throws InterruptedException {
        int count = COUNT;
        int[][][] matrix = new int[count][count][count];
        long startTime = System.currentTimeMillis();
        OneThreadGeneration oneThreadGeneration = new OneThreadGeneration(matrix);
        oneThreadGeneration.mThread.join();
        long endTime = System.currentTimeMillis();
        System.out.println("Час генерування одним потоком: " + (endTime - startTime) +".");
    }

}
