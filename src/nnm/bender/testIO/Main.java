package nnm.bender.testIO;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(buff);

        objectOutputStream.writeObject("Hello!");
        objectOutputStream.writeObject(new Integer(322));
        objectOutputStream.writeObject(new byte[][]{{1, 2}, {2, 1}});
        objectOutputStream.flush();
        objectOutputStream.close();

        byte[] rawData = buff.toByteArray();
        System.out.println(new String(rawData, "UTF-8"));

        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(rawData));
        System.out.println((String)objectInputStream.readObject());
        System.out.println((Integer)objectInputStream.readObject());
        System.out.println(Arrays.deepToString((byte[][]) objectInputStream.readObject()));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader reader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        int buff;
        while ((buff = reader.read()) > 0) {
            stringBuilder.append((char) buff);
        }
        return stringBuilder.toString();
    }

    //Cn+1=rotateLeft(Cn) xor bn+1
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int cn = 0;
        int b;
        while ((b = inputStream.read()) > 0) {
            cn = Integer.rotateLeft(cn, 1) ^ b;
        }
        return cn;
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        int b;
        byte[] buff = new byte[10];
        while ((b = inputStream.read(buff)) > 0) {
            System.out.println("work");
            outputStream.write(buff, 0, b);
        }
        inputStream.close();
        outputStream.flush();
        inputStream.close();
    }
}
