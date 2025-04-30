package com.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DescendingOrder {
    public static void main(String[]args){
        List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        mylist.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(e->System.out.print(e+" "));

    }
}
