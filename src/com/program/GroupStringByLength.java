package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {
    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Alice", "Charlie", "Eve");
       Map<Integer,List<String>> name = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(name);
    }
}
