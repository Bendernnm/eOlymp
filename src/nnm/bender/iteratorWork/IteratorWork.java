package nnm.bender.iteratorWork;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorWork {
    public static void main(String[] args) {
        Iterator<Integer> integerIterator1 = Arrays.asList(1, 3, 6, 9).iterator();
        Iterator<Integer> integerIterator2 = Arrays.asList(2, 4, 5).iterator();

        BufferIterator<Integer> integerBufferIterator = new BufferIterator<>(integerIterator1, integerIterator2);
        while (integerBufferIterator.hasNext()) {
            System.out.println(integerBufferIterator.next());
        }

        //
        //NavigableSet
        }

    }
