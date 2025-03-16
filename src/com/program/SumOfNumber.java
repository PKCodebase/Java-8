package com.program;

import java.util.Arrays;
import java.util.List;

public class SumOfNumber {
    public static void main(String[] args) {
       List<Integer> num = Arrays.asList(1,2,3,4,5);
       int sum = num.stream()
               .reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
