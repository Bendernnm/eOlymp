package nnm.bender;

public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);

    }

    @Override
    public String toString() {
        return "MyException:::";
    }
}
