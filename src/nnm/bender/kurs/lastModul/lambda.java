package nnm.bender.kurs.lastModul;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class lambda {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        System.out.println(integers.size());
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> tList = stream.collect(Collectors.toList());
        if (tList.size() != 0) {
            T max = (T) tList.stream().max(order).get();
            T min = (T) tList.stream().min(order).get();
            minMaxConsumer.accept(min, max);
        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    //13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)
    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, n -> ((n * n) / 10) % 1000); // your implementation here
    }

    private static int mid(double n) {
        return (int) n;
    }

    public static void test(Runnable runnable) {
        runnable.run();
    }

    public static <T, U> Function<T, U> ternaryOperator(
            final Predicate<? super T> condition,
            final Function<? super T, ? extends U> ifTrue,
            final Function<? super T, ? extends U> ifFalse) {

        /*return new Function<T, U>() {
            @Override
            public U apply(T t) {
                return condition.test(t)?ifTrue.apply(t):ifFalse.apply(t);
            }
        };*/
        return (T t) -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }

}
