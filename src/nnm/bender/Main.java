package nnm.bender;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final int MATRIX_LENGTH = 10000;

    public static double summ() throws InterruptedException {
        int[][] array = new int[MATRIX_LENGTH][MATRIX_LENGTH];
        Thread.sleep(100);
        for (int i = 0; i < MATRIX_LENGTH; i++) {
            for (int j = 0; j < MATRIX_LENGTH; j++) {
                array[i][j] = i;
            }
        }
        int summ = 0;
        Thread.sleep(100);
        for (int i = 0; i < MATRIX_LENGTH; i++) {
            // System.out.println("summ:" + i);
            for (int j = 0; j < MATRIX_LENGTH; j++) {
                summ += array[i][j];
            }
        }
        return summ;
    }

    public static void main(String[] args) throws InterruptedException {
        //region first quest
/*boolean[] a = {false, false, true, true};
        boolean[] b = {false, true, false, true};
        System.out.println("FIRST:");
        System.out.println("^");
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i]^b[i])+"\t");
        }
        System.out.println("\n!=");
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i]!=b[i])+"\t");
        }
        System.out.println("\nEND FIRST\nSECOND:");
        System.out.println("&");
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i]&b[i])+"\t");
        }
        System.out.println("\n==");
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i]==b[i])+"\t");
        }
        System.out.println("\nEND SECOND\nTHIRD:");
        System.out.println("|");
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i]|b[i])+"\t");
        }
        System.out.println("\n!=");
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i]!=b[i])+"\t");
        }
        System.out.println("\nEND THIRD\nFOURTH:");
        System.out.println("|");
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i]|b[i])+"\t");
        }
        System.out.println("\n||");
        for (int i = 0; i < a.length; i++) {
            System.out.print((a[i]||b[i])+"\t");
        }
        System.out.println("\nEND FOURTH");*/
        //endregion
        //region exception Handling
        /*try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println("divided by zero exception");
            ;
        }
        int a = 0, b = 0, c = 0;
        Random random = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
                System.out.println("not divided by zero exception");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                a = 0;
            }
        }
        System.out.println("End");*/
        /*try {
            System.out.println("start");
            throw new MyException("error()");
        } catch (MyException e) {
            System.out.println(e);
        }*/
        //endregion
        //region testThread
        /*Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.toString());
        System.out.println("name = "+currentThread.getName());*/

        /*Thread a = new Thread();
        a.start();
        System.out.println("check: " + a.isAlive());
        a.stop();
        System.out.println("check: " + a.isAlive());*/


        /*new MyThreadEx();
        new MyThreadEx();*/
        /*MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        System.out.println("UI создан");
        for (int i = 0; i < 3; i++) {
            System.out.println("UI ping:" + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().isAlive());
        System.out.println("UI end");
        System.out.println(Thread.currentThread().isAlive());*/

       /* Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setPriority(1);
        System.out.println("status: "+thread.isAlive()+".");
        thread.start();
        System.out.println("status: " + thread.isAlive() + ".");
        thread.sleep(1000);
        System.out.println("status: " + thread.isAlive() + ".");*/


        //endregion
        //region testThreadExample
/*long startNoThread = System.currentTimeMillis();
        double summNoThread = summ() + summ();
        System.out.println("summ result = " + summNoThread);
        long endNoThread = System.currentTimeMillis();
        long timeNoThred = endNoThread - startNoThread;

        System.out.println("thread");
        long startThread = System.currentTimeMillis();
        SummThread summ1 = new SummThread();
        SummThread summ2 = new SummThread();
        double summ1Summ = summ1.getSumm();
        double summ2Summ = summ2.getSumm();
        double summThread = summ1Summ + summ2Summ;
        long endThread = System.currentTimeMillis();
        long timeThred = endThread - startThread;
        System.out.println("time no thread = " + timeNoThred + " summ = " + summNoThread);
        System.out.println("time  thread = " + timeThred + " summ = " + summThread);*/
        //endregion
        //region time
         /* long before = System.currentTimeMillis();
        Thread.sleep(1000);
        long after = System.currentTimeMillis();
        System.out.println(after - before);*/
        //endregion
        //region BigInteger
        /*BigInteger a = new BigInteger("100000000000000000000000000");
        BigInteger b = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        BigInteger c = new BigInteger(String.valueOf(2));
        a = a.add(c);
        System.out.println(a);
        boolean check = a.equals(b);
        System.out.println(b + "?" + a + "\t\t\t => a" + (check ? ">" : "<") + "b.");*/

        BigInteger aBI = new BigInteger("5");
        int aI = 5;
        BigInteger bBI = new BigInteger("3");
        int bI = 3;
        System.out.println("int%int = " + (aI % bI));
        System.out.println("BigInteger%BigInteger = " + (aBI.mod(bBI)));

        //endregion

        /*int a = 3;
        int b = 2;
        int c = a + b;
        int d = a * b + c;
        int result = 1;

        for (int i = 0; i < 2; i++) {
            result += i;
        }
        System.out.println(d);
        int k = result * d;*/
        //1 2 3 4 5 6 7
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        System.out.println(integers.toString());
        boolean flag = true;
        for (int i = 0; i < integers.size(); i++) {
            if (flag) {
                if (i % 2 == 0) {
                    integers.remove(i);
                    flag = false;
                }
            }
            else {
                if (i % 2 != 0) {
                    integers.remove(i);
                    flag = true;
                }
            }
        }
        //2 4 6
        System.out.println(integers.toString());
        System.out.println("hmm");
        System.out.println("hmm: "+integers.size());
        int size = integers.size();
        for (int i = size-1; i > -1; i--) {
            System.out.print(integers.get(i) + "\t");
        }
        //6 4 2
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                StringBuilder sb = new StringBuilder(textLines[i]);
                int lastRoleIndex = sb.indexOf(":");
                if (sb.substring(0, lastRoleIndex).equals(role)) {
                    result.append((i + 1) + ") " + sb.substring(lastRoleIndex + 2) + "\n");
                }
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        /*int[] a3 = ArrayUtils.addAll(a1, a2);
        Arrays.sort(a3);*/
        int[] a3 = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a2, 0, a3, a1.length, a2.length);
        Arrays.sort(a3);
        return a3; // your implementation here
    }

    public static BigInteger factorial(int value) {
        if (value == 0) {
            return BigInteger.valueOf(1);
        }
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= value; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial; // your implementation here
    }

    public static long longExpression(int a, int b, int c) {
        long M = 100000000000L;
        long buff1 = (M % a) >> b;
        long buff2 = 100 / c;
        return buff1 | buff2;
    }

    public static boolean doubleExpression(double a, double b, double c) {
        double eps = 1E-4;
        return Math.abs((a + b) - c) < eps;
        // return ((value!=0)&&((value%Math.abs(2))==0));
    }

    public static int flipBit(int value, int bitIndex) {
        return (1 << (bitIndex - 1)) ^ value; // put your implementation here
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }

    public static boolean isPowerOfTwo(int value) {
        return (value != 0) && ((Math.abs(value) & (Math.abs(value) - 1)) == 0); // you implementation here
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W", "");
        String revers = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(revers);// your implementation here
    }
}
