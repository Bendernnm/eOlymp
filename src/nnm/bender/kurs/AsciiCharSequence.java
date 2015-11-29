package nnm.bender.kurs;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] arrayByte;

    public AsciiCharSequence(byte[] arrayByte) {
        this.arrayByte = Arrays.copyOf(arrayByte, arrayByte.length);
    }

    public byte[] getArrayByte() {
        return arrayByte;
    }

    public void setArrayByte(byte[] arrayByte) {
        this.arrayByte = Arrays.copyOf(arrayByte, arrayByte.length);
    }

    @Override
    public int length() {
        return arrayByte.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arrayByte[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = start; i < end; i++) {
            stringBuilder.append(charAt(i));
        }
        return stringBuilder;
    }


    @Override
    public String toString() {
        return new StringBuilder(new String(arrayByte)).toString();
    }

}
