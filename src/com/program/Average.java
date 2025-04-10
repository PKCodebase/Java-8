package com.program;
import java.util.List;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[]args){
        List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
                  Double avg = mylist.stream()
                           .mapToDouble(Integer::intValue)
                           .average()
                           .orElse(0.0);
                  System.out.println("Average : " + avg);



                  System.out.println("-----------");
        double avg2 = mylist.stream()
                .collect(Collectors.averagingDouble(Integer::doubleValue));
        System.out.println("Average : " + avg2);
    }
}
