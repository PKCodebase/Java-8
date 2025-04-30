package com.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestWord {
    public static void main(String[] args){
        List<String> list = Arrays.asList("kaushik","prasad","kumar","sahoo","kumar","sahoo");

        String longestWord = list.stream()
                .max(Comparator.comparingInt(String::length))
                        .orElse(null);
                System.out.println(longestWord);
    }
}
