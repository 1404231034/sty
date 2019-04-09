package com.lpc.java8x.news;

public class Demo1 {
    public static void main(String[] args){
        Runnable runnable = () -> System.out.println("这个是用拉姆达实现的线程");
        new Thread(runnable).start();
    }
}
