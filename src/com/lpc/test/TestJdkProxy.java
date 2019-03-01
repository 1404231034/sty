package com.lpc.test;

import com.lpc.jdk.proxy.HelloWorld;
import com.lpc.jdk.proxy.HelloWorldImpl;
import com.lpc.jdk.proxy.JdkProxyExample;

public class TestJdkProxy {
    public static void main(String[] a){
        JdkProxyExample jdk = new JdkProxyExample();

        HelloWorld proxy = (HelloWorld)jdk.bind(new HelloWorldImpl());

        proxy.sayHelloWorld();
    }
}
