package nnm.bender.kurs.lastModul.map;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.next() + " ");
        }
        List<String> list = new ArrayList<>();
        //("[^a-zA-Zа-яА-Я0-9]+")
        String[] strings = stringBuilder.toString().toLowerCase().split("[-,;:=.!?\\s]+");
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
        }
        Map<String, List<String>> collect = list.stream().collect(
                Collectors.groupingBy(o -> o));

        List<String[]> collect2 = collect
                .entrySet()
                .stream()
                .map(e -> new String[]{e.getKey(),
                        String.valueOf(e.getValue().size())})
                .collect(Collectors.toList());

        Collections.sort(collect2, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int i1 = Integer.parseInt(o1[1]);
                int i2 = Integer.parseInt(o2[1]);
                int i3 = i1 - i2;
                return i3 == 0 ? o1[0].compareTo(o2[0]) : i1 > i2 ? -1 : 1;
            }
        });

        int n = collect2.size() > 10 ? 10 : collect2.size();
        for (int i = 0; i < n; i++) {
            System.out.println(collect2.get(i)[0]);
        }
    }
}
