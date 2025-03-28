package com.program;

import java.util.Arrays;
import java.util.List;



public class ReduceSum {
    public static void main(String[]args){
        List<Integer> mylist = Arrays.asList(1,2,3,3,4,45,5);
        int num = mylist.stream()
                .reduce(0,Integer::sum);
                System.out.println("Sum : " + num);
    }
}
