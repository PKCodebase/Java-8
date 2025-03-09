package com.program;
import java.util.Arrays;
import java.util.List;

public class PrintValue {
    public static void main(String[]args){
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
        names.forEach(name->System.out.print(name+" "));


        System.out.println();
        System.out.println("-----------");


        List<Integer> num = Arrays.asList(1,2,3,4);
        num.forEach(number->System.out.print(number+" "));
    }
}
