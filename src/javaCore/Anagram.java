package javaCore;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String[] words = {"ab", "ba", "xx", "xy", "yx"};

        SortedMap<String, Set<String>> dictionary = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }
                char[] firstWord = o1.toCharArray();
                char[] secondWord = o2.toCharArray();
                Arrays.sort(firstWord);
                Arrays.sort(secondWord);
                return new String(firstWord).compareTo(new String(secondWord));
            }

        });

        for (String word:words) {
            Set<String> dictionaryItem = dictionary.get(word);
            if (dictionaryItem == null) {
                dictionary.put(word, new HashSet<>(Arrays.asList(word)));
            } else {
                dictionaryItem.add(word);
            }
        }
        System.out.println(dictionary.toString());
    }

}
