package com.program;

import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(10) // Change limit to generate more numbers
                .map(f -> f[0])
                .forEach(n -> System.out.print(n + " "));
    }

}
