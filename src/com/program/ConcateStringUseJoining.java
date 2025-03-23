package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcateStringUseJoining {
    public static void main (String[] args){
        System.out.print("Concatenating String using Joining : ");
        List<String> mylist = Arrays.asList("My","Name","is","kaushik");
        String newValue = mylist.stream()
                .collect(Collectors.joining(" "));
        System.out.println(newValue);


        System.out.print("Summing Integers using SummingInt Collector : ");
        List<Integer> mylist1 = Arrays.asList(10,40,60,80);
        Integer myvalue = mylist1.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println(myvalue);

        System.out.print("Summing Double using SummingDouble Collector : ");

        List<Double> mylist2 = Arrays.asList(10.6,40.8,60.0,80.0);
        Double myvalue2 = mylist2.stream()
                .collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println(myvalue2);

    }

}
