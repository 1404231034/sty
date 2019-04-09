package com.lpc.java8x.news;

public class Demo2 {
    public static void main(String[] args){

        Runnable runnable = Demo2::run;

        new Thread(runnable).start();
    }

    public static void run(){
        System.out.println("方法调用");
    }
}
