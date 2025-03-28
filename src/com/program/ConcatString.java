package com.program;

import java.util.Arrays;
import java.util.List;

public class ConcatString {
    public static void main(String args[]){
        List<String> mylist = Arrays.asList("My","Name","kaushik","Prasad");
        String str = mylist.stream()
                .reduce("",(a,b)->a+b + " " );
        System.out.println(str.trim());
    }
}
