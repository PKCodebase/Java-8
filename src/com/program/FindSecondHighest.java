package com.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighest {
    public static void main(String[] args){
     List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
     mylist.stream()
             .sorted(Comparator.reverseOrder())
             .skip(2)
             .limit(1)
             .forEach(System.out::println);
    }
}
