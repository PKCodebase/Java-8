package com.program;

import java.util.List;
import java.util.Optional;

public class ReduceMaxMin {
    public static void main(String[]args){
        List<Integer> mylist = List.of(20,45,6,56,23,87);
        int max = mylist.stream()
                .reduce(0,Integer::max);

        System.out.println("Max : "+ max);

        System.out.println("----------------");

        Optional<Integer> min = mylist.stream()
                .reduce(Integer::min);
        System.out.println("Min : "+ min.orElseThrow());
    }
}
