package com.program;

import java.util.Arrays;
import java.util.List;

public class AscendingOrder {
    public static void main(String[]args){
        List<Integer> mylist = Arrays.asList(10,15,8,49,25,98,98,32,15);
        mylist.stream()
                .sorted()
                .forEach(e->System.out.print(e+" "));
    }
}
