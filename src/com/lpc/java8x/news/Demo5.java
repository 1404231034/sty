package com.lpc.java8x.news;

import java.util.stream.IntStream;

public class Demo5 {
    public static void main(String[] args){
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
    }
}
