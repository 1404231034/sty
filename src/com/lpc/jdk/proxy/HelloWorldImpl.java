package com.lpc.jdk.proxy;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world");
    }
}
