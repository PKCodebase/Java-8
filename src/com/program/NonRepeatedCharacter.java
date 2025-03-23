package com.program;

public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aabbccddffe";
        Character result =str.chars()
                .mapToObj(c->(char)c)
                .filter(c->str.indexOf(c)==str.lastIndexOf(c))
                .findFirst()
                .orElse(null);
        System.out.println(result);

    }
}
