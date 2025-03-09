package com.program;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
    public static void main(String []args){
        List<Integer> num = Arrays.asList(10,2,4,6,76,32,23);
        int max = num.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);

        System.out.println("-----------");

        int min = num.stream()
                .min(Integer::compare)
                .orElse(0);
        System.out.println(min);
    }
}
