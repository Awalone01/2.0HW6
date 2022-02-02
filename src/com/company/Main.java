package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("ace", "boom", "crew", "dog", "eon", "crew", "crew", "crew", "crew", "crew", "crew"));

//        evenInteger(nums);
        oddInteger(nums);
//        uniqueWords(words);
        countDupWords(words);

    }

    public static void evenInteger(List<Integer> nums) {
        nums.removeIf(integer -> integer % 2 == 0);

        System.out.println("nums12321 = " + nums);
    }

    public static void oddInteger(List<Integer> nums) {
        Set<Integer> set = new HashSet<>(nums);
        nums.clear();
        nums.addAll(set);
        nums.removeIf(integer -> integer % 2 == 1);

        System.out.println("nums0000 = " + nums);
    }

    public static void uniqueWords(List<String> words) {
        Set<String> setWords = new HashSet<>(words);

        System.out.println("words = " + setWords);
    }

    public static void countDupWords(List<String> words) {
        int count = 0;
        Set<String> duplicates = new HashSet<>();
        Set<String> tracking = new HashSet<>();

        for (String word: words) {
            if (!tracking.add(word)) {
                duplicates.add(word);
                count++;
            }
        }
        System.out.println("Количество дубликатов: " + count);
    }
}
