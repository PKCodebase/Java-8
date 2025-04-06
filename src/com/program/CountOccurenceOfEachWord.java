package com.program;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfEachWord {
    public static void main(String[] args){
        String str = "I am a good boy";
        Map<String,Long> wordCount = Arrays.stream(str.split(" "))

                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        System.out.println(wordCount);
    }
}
