package nnm.bender;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String buff1 = o1;
        String buff2 = o2;
        return buff1.compareTo(buff2);
    }
}

public class MyComparatorTest {
    public static void main(String[] args) {
        Comparator<String> comparator = new MyComp();
        Set<String> ts = new TreeSet<>(comparator.reversed());
        ts.add("B");
        ts.add("D");
        ts.add("A");
        ts.add("C");
        for (String item : ts) {
            System.out.println(item);
        }
    }
}
