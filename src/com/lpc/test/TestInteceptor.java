package com.lpc.test;

import com.lpc.inteceptor.proxy.InteceptorJdkProxy;
import com.lpc.jdk.proxy.HelloWorld;
import com.lpc.jdk.proxy.HelloWorldImpl;

public class TestInteceptor {
    public static void main(String[] a){
        HelloWorld proxy = (HelloWorld) InteceptorJdkProxy.bind(new HelloWorldImpl(),
                "com.lpc.inteceptor.proxy.MyInteceptor");

        proxy.sayHelloWorld();
    }
}
