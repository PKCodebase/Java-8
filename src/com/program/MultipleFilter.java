package com.program;

import java.util.Arrays;
import java.util.List;

public class MultipleFilter {
    public static void main(String[] args){
        List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        mylist.stream()
                .filter(n->n%2==0)
                .filter(n->n%3==0)
                .forEach(System.out::println);

        System.out.println("-----------");
        
        mylist.stream()
                .filter(n->n>2)
                .filter(n->n%2==0)
                .forEach(System.out::println);
    }
}
