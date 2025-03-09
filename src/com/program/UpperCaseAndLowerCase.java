package com.program;

import java.util.Arrays;
import java.util.List;

public class UpperCaseAndLowerCase {
    public static void main(String[] args){
        List<String> names = Arrays.asList("John", "Jane", "Alice", "Bob");
        names.stream()
                .map(String::toUpperCase)
                .forEach(name->System.out.print(name+" "));

        System.out.println();
        System.out.println("-----------");

        names.stream()
                .map(String::toLowerCase)
                .forEach(convert->System.out.print(convert+" "));
    }
}
