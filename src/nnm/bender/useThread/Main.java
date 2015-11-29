package nnm.bender.useThread;

import nnm.bender.useThread.RealExercise.ArrayWorkThread.DividerArrayRows;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //region writeString
        /*try {
            ArrayList<WriteStringThread> threads = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                threads.add(new WriteStringThread(i));
            }
            for (WriteStringThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //endregion
        try {
            int[][] array = {{2, 4, 6}, {6, 9, 12}, {10, 15, 20}};
            ArrayList<DividerArrayRows> dividerArrayRowses = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                switch (i) {
                    case 0:
                        dividerArrayRowses.add(new DividerArrayRows(array[i], 2));
                        break;
                    case 1:
                        dividerArrayRowses.add(new DividerArrayRows(array[i], 3));
                        break;
                    case 2:
                        dividerArrayRowses.add(new DividerArrayRows(array[i], 5));
                        break;
                }
            }
            for (DividerArrayRows thread : dividerArrayRowses) {
                thread.join();
            }
            for (int[] arr : array) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
