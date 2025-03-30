package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElement {
    public static void main(String[]args){
        List<Integer> mylist = Arrays.asList(1,2,3,4,5,5,1);
        mylist.stream()
                .distinct()
                .collect(Collectors.toList())
        .forEach(num->System.out.print(num+" "));


        System.out.println("");
        System.out.println("____________");


        List<String> mylist1 = Arrays.asList("1","2","3","4","5","5","1");
        mylist1.stream()
                .distinct()
                .forEach(value->System.out.print(value+" "));
    }
}
