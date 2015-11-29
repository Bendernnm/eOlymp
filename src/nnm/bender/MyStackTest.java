package nnm.bender;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStackTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.println(stack.pop());
        }
        /*while (stack.peek()!=null) {
            System.out.println(stack.pop());
        }*/
        /*for (String item:stack){
            System.out.println(item);
        }*/
    }
}
