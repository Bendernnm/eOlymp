package nnm.bender.kurs.lastModul;

import java.io.IOException;
import java.util.*;

public class GenericsTest {
    public static void main(String[] args) {

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new LinkedHashSet<>();
        for (T obj : set1) {
            if (!set2.contains(obj)) {
                set3.add(obj);
            }
        }
        for (T obj : set2) {
            if (!set1.contains(obj)) {
                set3.add(obj);
            }
        }
        return set3;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            integers.add(scanner.nextInt());

            if (scanner.hasNext()) {
                scanner.skip(" ");
            }
        }

        for (int i = integers.size() - 1; i > -1; i--) {
            if (i % 2 != 0) {
                System.out.print(integers.get(i) + " ");
            }
        }
    }
}

//        Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
//        а также статический фабричный метод of(). Конструктор должен быть закрытым (private).

class Pair<N, V> {
    N mFirst;
    V mSecond;

    private Pair(N first, V second) {
        mFirst = first;
        mSecond = second;
    }

    public N getFirst() {
        return mFirst;
    }

    public V getSecond() {
        return mSecond;
    }

    public static <N, V> Pair<N, V> of(N first, V second) {
        return new Pair<>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        if (mFirst != null ? !mFirst.equals(pair.mFirst) : pair.mFirst != null) return false;
        if (mSecond != null ? !mSecond.equals(pair.mSecond) : pair.mSecond != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mFirst != null ? mFirst.hashCode() : 0;
        result = 31 * result + (mSecond != null ? mSecond.hashCode() : 0);
        return result;
    }
}
