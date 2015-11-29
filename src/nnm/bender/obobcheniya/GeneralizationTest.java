package nnm.bender.obobcheniya;

public class GeneralizationTest<T> {
    private T  mT;

    public GeneralizationTest(T t) {
        mT = t;
    }

    public T getT() {
        return mT;
    }

    public void setT(T t) {
        mT = t;
    }

    @Override
    public String toString() {
        return "GeneralizationTest{" +
                "mT=" + mT +
                '}';
    }
}
