package nnm.bender.iteratorWork;

import java.util.Iterator;

class BufferIterator<T extends Comparable> implements Iterator<T> {
    private Iterator<T> mIteratorOne;
    private Iterator<T> mIteratorTwo;
    private T bufferValueOne;
    private T bufferValueTwo;

    public BufferIterator(Iterator<T> iteratorOne, Iterator<T> iteratorTwo) {
        mIteratorOne = iteratorOne;
        mIteratorTwo = iteratorTwo;
        bufferValueOne = mIteratorOne.hasNext() ? mIteratorOne.next() : null;
        bufferValueTwo = mIteratorTwo.hasNext() ? mIteratorTwo.next() : null;
    }

    @Override
    public boolean hasNext() {
        return bufferValueOne != null || bufferValueTwo != null;
    }

    @Override
    public T next() {
        T result = null;
        if ((bufferValueOne != null) && (bufferValueTwo != null)) {
            if (bufferValueOne.compareTo(bufferValueTwo) > 0) {
                result = bufferValueTwo;
                bufferValueTwo = mIteratorTwo.hasNext() ? mIteratorTwo.next() : null;
            } else {
                result = bufferValueOne;
                bufferValueOne = mIteratorOne.hasNext() ? mIteratorOne.next() : null;
            }
            return result;
        } else {
            if (bufferValueOne != null){
                result = bufferValueOne;
                bufferValueOne = mIteratorOne.hasNext() ? mIteratorOne.next() : null;
                return  result;
            }
            if (bufferValueTwo != null){
                result = bufferValueTwo;
                bufferValueTwo = mIteratorTwo.hasNext() ? mIteratorTwo.next() : null;
                return  result;
            }
            return  null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
