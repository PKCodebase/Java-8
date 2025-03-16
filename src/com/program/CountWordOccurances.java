package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurances {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Long> wordCounts = words.stream()
                .collect(Collectors.groupingBy(word->
                        word,Collectors.counting()));
        System.out.println(wordCounts);
    }
}
