package com.program;

import java.util.List;

public class ProductOfNumber {
    public static void main(String[]args){
        List<Integer> mylist = List.of(2,4,8);
        int product = mylist.stream()
                .reduce(1,(a,b)->a*b);
        System.out.println(product);
    }
}
