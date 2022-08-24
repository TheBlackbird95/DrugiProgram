package com.bootcamp.nedelja2;

import java.nio.charset.StandardCharsets;

public class StringMetode {
    public static void main(String[] args) {
        String string = "ITBootcamp";

        System.out.println(string.replaceAll(" ", ""));
        System.out.println(string.length());
        System.out.println(string.charAt(0));
       // System.out.println(string.charAt(10)); // Runtime exception
        System.out.println(string.indexOf("o"));
        System.out.println(string.indexOf("z"));
        System.out.println(string.indexOf('o', 4));
        System.out.println(string.substring(4));
        System.out.println(string.substring(4,8));
        System.out.println(string.contains("i"));
        System.out.println(string.contains("I"));
    }
}
