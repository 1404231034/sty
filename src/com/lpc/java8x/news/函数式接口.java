package com.lpc.java8x.news;

@FunctionalInterface
public interface 函数式接口 {

    int dosomething(int c, int b);

    default void 叫哥(){System.out.println("哥");}
}
